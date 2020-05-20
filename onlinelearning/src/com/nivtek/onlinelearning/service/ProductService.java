/**
 * 
 */
package com.nivtek.onlinelearning.service;

import java.util.List;

import com.nivtek.onlinelearning.dao.IProductDao;
import com.nivtek.onlinelearning.dao.ProductDao;
import com.nivtek.onlinelearning.entity.Product;

/**
 * @author AsimSubedi
 *
 */
public class ProductService implements IProductService {
	
	IProductDao productDao;

	public ProductService() {
		productDao = new ProductDao();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
