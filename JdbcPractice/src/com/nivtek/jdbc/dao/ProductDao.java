package com.nivtek.jdbc.dao;

import java.util.List;

import com.nivtek.jdbc.Product;

public interface ProductDao {
	
	
	void add(Product product);
	
	Product findById(int id);

	List<Product> findAll();
	
	void updata(Product product);
	
	void delete(int id);
	
	
	
}
