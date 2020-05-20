package com.nivtek.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nivtek.springapp.dao.MessageDAO;

@Component
public class SampleBean {
	
	
	@Autowired
	private MessageDAO messageDAO;
	
	public  String greet(){
		
		
		return messageDAO.fetchMessage();
	}
//	
//	public  String greet(){
//		
//		return "Welcome to Spring Framework";
//		
//		
//		
//	}
}
