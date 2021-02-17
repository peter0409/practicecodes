package com.nivtek.solrportal.solrcofig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.data.solr")
public class SolrProperties {

	/**
	 * Solr host. Ignored if "zk-host" is set.
	 */
	private String host = "http://localhost:8983/solr";

	/**
	 * ZooKeeper host address in the form HOST:PORT.
	 */
	private String zkHost;

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getZkHost() {
		return this.zkHost;
	}

	public void setZkHost(String zkHost) {
		this.zkHost = zkHost;
	}

}
