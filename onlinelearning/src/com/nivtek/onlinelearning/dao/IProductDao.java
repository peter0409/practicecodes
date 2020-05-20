package com.nivtek.onlinelearning.dao;

import java.util.ArrayList;

import com.nivtek.onlinelearning.entity.Product;

public interface IProductDao {

	// here we define all the methods for each db operations
	
	//add product
	int add(Product product);

	// find product by id
	Product findById(int id);

	// find all products
	ArrayList<Product> findAll();

	// update the product
	int update(Product product);

	// delete a product
	int delete(int id);

}
