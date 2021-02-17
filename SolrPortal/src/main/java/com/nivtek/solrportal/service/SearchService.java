package com.nivtek.solrportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.solrportal.dao.EmployeeRepository;
import com.nivtek.solrportal.entity.Employee;
import com.nivtek.solrportal.entity.EmployeeDomain;

@Service
public class SearchService {
	
	@Autowired private EmployeeRepository emplRepository;

	public List<EmployeeDomain> getAllemployee() {
		// TODO Auto-generated method stub
		return emplRepository.findAll();
	}

}
