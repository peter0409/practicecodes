package com.nivtek.springapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nivtek.springapp.dbstore.MySQLDBStore;
import com.nivtek.springapp.vo.Product;


@Repository
public class ProductDAOHib implements IProductDAO{

private Logger logger = LoggerFactory.getLogger(Product.class);
	
	
	private List<Product> productList = new ArrayList<Product>();
	
	

	public ProductDAOHib() {
		productList = MySQLDBStore.PRODUCTS;

	}

	@Override
	public void add(Product product) {
		
		
logger.info("****add()*****");
		productList.add(product);
		
	}

	@Override
	public Product findById(int id) {
		logger.info("****findById()*****");
		
		
//		List<Product> products = new ArrayList<>();
//		
//		Optional<Product> result = products.stream().filter(p->p.getId()==id).findFirst();
		
		return productList.stream().filter(p->p.getId()==id).findFirst().get();
	}

	@Override
	public List<Product> findProducts() {
		
		logger.info("****findProducts()*****");
		return null;
	}

	@Override
	public void update(Product product) {
		logger.info("****update()*****");
		Product inventoryProduct =productList.stream().filter(p->p.getId()==product.getId()).findFirst().get();
		inventoryProduct.setQuantity(product.getQuantity());
	
	}

}
