package com.nivtek.solrportal.solrcofig;

import java.util.Collections;
import java.util.Optional;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
//@EnableSolrRepositories(basePackages = "com.nivtek.solrportal.dao")
@ComponentScan
public class SolrConfig {
	
	@Value("${spring.data.solr.zk-host}")
	private String zkHost;

    @Bean
    public SolrClient solrClient() {
        //return new HttpSolrClient.Builder("http://localhost:8983/solr/").build();
    	
    	CloudSolrClient client = new CloudSolrClient.Builder(Collections.singletonList(zkHost), Optional.empty())
    			.withConnectionTimeout(5000)
    		    .withSocketTimeout(10000)
    		    .build();
    	client.setDefaultCollection("employee");
    	return client;
    }
 
    @Bean
    public SolrTemplate solrTemplate(SolrClient client) throws Exception {
        return new SolrTemplate(client);
    }
    
    
}