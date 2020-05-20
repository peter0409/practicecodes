/**
 * 
 */
package com.nivtek.productportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.productportal.dao.ProductDAO;
import com.nivtek.productportal.entity.Product;

/**
 * @author AsimSubedi
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;

	@Override
	public Product findById(int id) {

		Product product = productDAO.findById(id);
		return product;
	}

	@Override
	public int saveProduct(Product product) {
		int productSaved = productDAO.saveProduct(product);
		return productSaved;
	}

}
