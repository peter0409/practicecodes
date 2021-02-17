package com.nivtek.bankportal.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.step.tasklet.MethodInvokingTaskletAdapter;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.nivtek.bankportal.dao.TransactionDAO;
import com.nivtek.bankportal.entity.Transaction;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {
	
	
	
	@Bean
    public DataSource mysqlDataSource() {
		
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/batchprocessdb");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
 
        return dataSource;
    }
	

	@Bean(name="insertionJob")
	public Job job(JobBuilderFactory JobBuilderFactory, StepBuilderFactory StepBuilderFactory,
			ItemProcessor<Transaction, Transaction> itemProcessor, ItemReader<Transaction> itemReader,
			ItemWriter<Transaction> itemWriter

	) {

		Step step = StepBuilderFactory.get("txt-file-load").<Transaction, Transaction>chunk(100).reader(itemReader)
				.processor(itemProcessor).writer(itemWriter).build();

		return JobBuilderFactory.get("file-load").incrementer(new RunIdIncrementer()).start(step).build();

	}

	@Bean
	public FlatFileItemReader<Transaction> itemReader() {

		FlatFileItemReader<Transaction> flatFileItemReader = new FlatFileItemReader<>();
		flatFileItemReader.setResource(new PathResource("C:\\bootcampjan2020\\Development\\Workspace\\corejava\\BankPortal\\src\\main\\resources\\transactions.txt"));
		flatFileItemReader.setName("TXT-Reader");
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setLineMapper(lineMapper());

		return flatFileItemReader;

	}
	
	@Bean(name = "updateJob")
	public Job updateTransactionJob(@Qualifier("updateStep") Step step, JobBuilderFactory jobBuilderFactory) {
		
		return jobBuilderFactory.get("updateTransactionJob")
			.incrementer(new RunIdIncrementer())
			.flow(step)
			.end()
			.build();
		
	}
	
	
	@Bean(name = "updateStep")
	public Step stepOfUpdate(StepBuilderFactory stepBuilderFactory) {
		
	    return stepBuilderFactory.get("stepOfUpdate")
	    			.tasklet(updateTransactionTasklet())
	    			.build();
	    
	}
	
	@Bean
	public MethodInvokingTaskletAdapter updateTransactionTasklet() {
		
		MethodInvokingTaskletAdapter adapter = new MethodInvokingTaskletAdapter();

		adapter.setTargetObject(getTransactionDao());
		adapter.setTargetMethod("processTransactions");

		return adapter;
	}
	
	
	@Bean
	public TransactionDAO getTransactionDao() {
		
		return new TransactionDAO();
		
	}

	@Bean
	public LineMapper<Transaction> lineMapper() {

		DefaultLineMapper<Transaction> defaultLineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();

		lineTokenizer.setDelimiter("	");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames(new String[] { "date", "merchant", "amount", "location" });

		BeanWrapperFieldSetMapper<Transaction> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Transaction.class);

		defaultLineMapper.setLineTokenizer(lineTokenizer);
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);

		return defaultLineMapper;
	}

	@Bean
	public JdbcBatchItemWriter<Transaction> jdbcWriter(DataSource dataSource) {

		JdbcBatchItemWriter<Transaction> writer = new JdbcBatchItemWriter<>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Transaction>());
		writer.setSql(
				"insert into transaction (merchant,amount,location,date,status) values (:merchant,:amount,:location,:date,:status)");
		writer.setDataSource(dataSource);

		return writer;

	}

}
