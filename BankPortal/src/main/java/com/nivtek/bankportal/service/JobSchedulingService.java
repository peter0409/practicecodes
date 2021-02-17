package com.nivtek.bankportal.service;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@EnableScheduling
@Service
public class JobSchedulingService {

	@Autowired
	private JobLauncher jobLauncher;
	
	@Autowired
	@Qualifier("updateJob")
	private Job updateTransactionJob;
	
	@Scheduled(cron = "${update-time}")
	public void processTransactions() throws Exception {
		
		JobParameters params = new JobParametersBuilder().addString("processTransactionsJobID", String.valueOf(System.currentTimeMillis()))
				.toJobParameters();
		jobLauncher.run(updateTransactionJob, params);
		
	}
}
