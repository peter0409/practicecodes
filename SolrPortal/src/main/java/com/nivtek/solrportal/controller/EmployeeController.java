package com.nivtek.solrportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nivtek.solrportal.entity.EmployeeDomain;
import com.nivtek.solrportal.service.IndexingService;
import com.nivtek.solrportal.service.SearchService;

@RestController
public class EmployeeController {

	@Autowired IndexingService indexingService;
	@Autowired SearchService searchService;

//	@PostConstruct
//	public void addEmployees() {
//		List<Employee> employees = new ArrayList<>();
//		employees.add(new Employee(111, "Peter", "dallas" ));
//		employees.add(new Employee(222, "James",  "Austin"));
//		employees.add(new Employee(111, "Michael","Huston"));
//
//		repository.saveAll(employees);
//
//	}

//	@GetMapping("/employees")
//	public List<Employee> getEmployees() {
//
//		return (List<Employee>) repository.findAll();
//
//	}

//	@GetMapping("/employees/{id}")
//	public List<Employee> getEmployeeById(@PathVariable int id) {
//
//		return repository.findById(id);
//	}

	@GetMapping("/buildindex")
	public String buildIndex() {

		indexingService.indexDocuments();
		return "Indexed document";

	}
	
	
	@GetMapping("/employees")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<EmployeeDomain> getEmployees(@RequestParam(required = false) String searchTxt) {
		
	
		
		List<EmployeeDomain> emplList = searchService.getAllemployee();
		
		return emplList;
	}
}
