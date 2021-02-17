package com.nivtek.solrportal.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.data.solr.repository.Boost;
import org.springframework.data.solr.repository.Facet;
import org.springframework.data.solr.repository.Highlight;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import com.nivtek.solrportal.entity.Employee;

public interface EmployeeSolrRepositpry extends SolrCrudRepository<Employee, Integer> {
	
	
//	Employee findById(int id);

	@Query("name:*?0*")
	List<Employee> findByName(String searchTerm);

	@Query("name:*?0* OR id:*?0* OR address:*?0*")
	List<Employee> findByEmployeeQuery(String searchTerm);
	
	Page<Employee> findByNameOrAddress(@Boost(2) String name, String address, Pageable pageable);
	
	
	@Query("name:?0")
	@Facet(fields = { "address" }, limit = 5)
	FacetPage<Employee> findByNameAndFacetOnAddress(String name, Pageable page);
	
	
	@Highlight(prefix = "<highlight>", postfix = "</highlight>")
	HighlightPage<Employee> findByAddress(String address, Pageable pageable);

}
