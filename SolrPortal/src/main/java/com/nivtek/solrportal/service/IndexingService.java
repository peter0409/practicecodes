package com.nivtek.solrportal.service;

import java.io.IOException;
import java.util.List;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.solrportal.dao.EmployeeRepository;
import com.nivtek.solrportal.entity.Employee;
import com.nivtek.solrportal.entity.EmployeeDomain;

@Service
public class IndexingService {

	@Autowired
	public SolrClient solrClient;

	@Autowired
	public EmployeeRepository employeeRepository;

	public void indexDocuments() {

		// List of employees, call your repository layer and get list of employees

		List<EmployeeDomain> employee = employeeRepository.findAll();
		
		System.out.println("INSIDE indexDocuments() " + employee.size());
		
		for (EmployeeDomain em : employee) {

			System.out.println(em.getId() + "::" + em.getName());

			SolrInputDocument document = new SolrInputDocument();
			document.addField("id", em.getId());
			document.addField("name", em.getName());
			document.addField("address", em.getAddress());

			// loop through the list
//		
//		SolrInputDocument document = new SolrInputDocument();
//		document.addField("id", "552199");
//		document.addField("name", "Gouda cheese wheel");
//		document.addField("address", "49.99");
//		
			try {
				UpdateResponse response = solrClient.add(document);

			} catch (SolrServerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
