package com.mtc.app.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.mtc.app.entity.Product;

public interface ProductDAO {
	
	void add(Product product) throws FileNotFoundException, IOException;
	
	Product findById(Integer id) throws FileNotFoundException, SQLException, IOException;
	
	List<Product> findAll() throws FileNotFoundException, SQLException, IOException;
	
	void update(Product product) throws FileNotFoundException, SQLException, IOException;
	
	void delete(Integer id) throws FileNotFoundException, SQLException, IOException;

}
