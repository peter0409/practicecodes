package com.nivtek.productportal.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nivtek.productportal.dao.ProductDAO;
import com.nivtek.productportal.entity.Product;



@RestController
public class ProductRestController {
	
	
	@Autowired
	private ProductDAO productDAOImpl;
	
	
	@GetMapping(produces = "application/xml")
	public Product findById(int id) {
		
		
		
		Product product =productDAOImpl.findById(id);
		return product;
	}

}
