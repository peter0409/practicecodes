package com.nivtek.solrportal.solrcofig;

import java.util.Arrays;
import java.util.Optional;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.solr.SolrProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration(proxyBeanMethods = false)
@ConditionalOnClass({ HttpSolrClient.class, CloudSolrClient.class })
@EnableConfigurationProperties(SolrProperties.class)
public class SolrAutoConfiguration {

//	@Bean
//	@ConditionalOnMissingBean
//	public SolrClient solrClient(SolrProperties properties) {
//		if (StringUtils.hasText(properties.getZkHost())) {
//			return new CloudSolrClient.Builder(Arrays.asList(properties.getZkHost()), Optional.empty()).build();
//		}
//		return new HttpSolrClient.Builder(properties.getHost()).build();
//	}

}
