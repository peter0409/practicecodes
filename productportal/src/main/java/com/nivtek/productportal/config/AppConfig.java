/**
 * 
 */
package com.nivtek.productportal.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nivtek.productportal.service.ProductService;
import com.nivtek.productportal.service.ProductServiceImpl;

/**
 * @author AsimSubedi
 *
 */
@Configuration
public class AppConfig {
	
	@Bean("dataSource")
	public BasicDataSource getBasicDataSource() {
		
		BasicDataSource basicDataSource = new BasicDataSource();

		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/maheshdb");
		basicDataSource.setUsername("nivtekdev");
		basicDataSource.setPassword("nivtekdev");
		basicDataSource.setInitialSize(5);
		basicDataSource.setMaxTotal(10);

		return basicDataSource;
		
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getBasicDataSource());
		
		return jdbcTemplate;
	}

}
