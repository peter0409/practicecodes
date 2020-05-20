/**
 * 
 */
package com.nivtek.onlinelearning.service;

import java.util.List;

import com.nivtek.onlinelearning.entity.Product;

/**
 * @author AsimSubedi
 *
 */
public interface IProductService {
	
	Product findById(int id);
	List<Product> findAll();

}
