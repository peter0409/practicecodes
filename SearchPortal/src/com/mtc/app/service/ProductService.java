package com.mtc.app.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.mtc.app.dao.ProductDAO;
import com.mtc.app.entity.Product;

public class ProductService implements IProductService {
	
	ProductDAO productDAO;

	@Override
	public List<Product> findAll() throws FileNotFoundException, SQLException, IOException {
		
		List<Product> productList = productDAO.findAll();
		
		return productList;
		
	}

	@Override
	public Product findById(int id) throws FileNotFoundException, SQLException, IOException {
		
		Product product = new Product();
		
		product = productDAO.findById(id);
		
		return product;
		
		
	}

}
