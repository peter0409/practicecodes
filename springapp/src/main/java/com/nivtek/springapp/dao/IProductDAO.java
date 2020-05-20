package com.nivtek.springapp.dao;

import java.util.List;

import com.nivtek.springapp.vo.Product;

public interface IProductDAO {
	
	
	void add(Product product);
	Product findById(int id);
	List<Product> findProducts();
	void update(Product product);
	

}
