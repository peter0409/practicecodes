package com.nivtek.room3145api.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nivtek.room3145.entity.People;
import com.nivtek.room3145.service.PeopleService;

@RequestMapping("/peopleapi/v1")
@RestController
public class Room3145Controller {
	
	@Autowired
	PeopleService peopleService;
	
	@GetMapping("/greeting")
	public String getGreeting() {
		
		return "Hello! Welcome to 3145!";
	}
	
	@GetMapping("/scream")
	public String screamLoud() {
		
		return "OOOOOOOOOOooooooooo";
	}
	
	
	@GetMapping("/people")
	public ArrayList<People> getPeople() {
		
		return peopleService.getPeople();
	}
	
	@GetMapping("/peoplename/{id}")
	public String getPeopleName(@PathVariable int id) {
		
		return peopleService.getPeopleName(id);
	}
}
