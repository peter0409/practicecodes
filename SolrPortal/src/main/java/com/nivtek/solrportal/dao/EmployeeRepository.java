package com.nivtek.solrportal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nivtek.solrportal.entity.Employee;
import com.nivtek.solrportal.entity.EmployeeDomain;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDomain, Integer>{

	//void saveAll(List<Employee> employees);
	
	List<EmployeeDomain> findById(int id);
	
	List<EmployeeDomain> findByName(String name);

}
