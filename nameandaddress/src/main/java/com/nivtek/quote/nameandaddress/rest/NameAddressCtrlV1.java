package com.nivtek.quote.nameandaddress.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nivtek.quote.nameandaddress.dao.NameAddressDao;
import com.nivtek.quote.nameandaddress.model.NameAndAddress;

@RestController
@RequestMapping("api/v1")
public class NameAddressCtrlV1 {
	
	@Autowired
	private NameAddressDao nmdDao;
	
	@PostMapping("nameaddres")
	public NameAndAddress add(@RequestBody NameAndAddress nameAndAddress) {
		
		return nmdDao.addNameAndAddress(nameAndAddress);
		
	}
	
	
	@GetMapping("nameaddres")
	public List<NameAndAddress> fetch(){
		return nmdDao.fetchAllNameAddress();
		
	}	
		
		
	}
	
	
//	@GetMapping("company")
//	public String getCompany() {
//		
//		return "Ektha";
//		
//	}


