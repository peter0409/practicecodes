package com.nivtek.productportal.dao;

import org.springframework.stereotype.Repository;

import com.nivtek.productportal.entity.Product;

/**
 * @author AsimSubedi
 *
 */
@Repository
public interface ProductDAO {
	
	Product findById(int id);

	int saveProduct(Product product);

}