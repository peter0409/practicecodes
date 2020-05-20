package com.mtc.app.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.mtc.app.entity.Product;

public interface IProductService {
	
	public List<Product> findAll() throws FileNotFoundException, SQLException, IOException;
	
	public Product findById(int id) throws FileNotFoundException, SQLException, IOException;

}
