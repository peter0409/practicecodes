/**
 * 
 */
package com.nivtek.productportal.service;

import org.springframework.stereotype.Service;

import com.nivtek.productportal.entity.Product;

/**
 * @author AsimSubedi
 *
 */
@Service
public interface ProductService {
	
	Product findById(int id);

	int saveProduct(Product product);

}
