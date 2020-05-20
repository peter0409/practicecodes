package com.nivtek.springapp.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.springapp.dao.IOrderDAO;
import com.nivtek.springapp.dao.IProductDAO;
import com.nivtek.springapp.vo.Order;
import com.nivtek.springapp.vo.Product;

@Service
//public class OrderService implements InitializingBean, DisposableBean, IOrderService {
	
	
public class OrderService implements IOrderService {
	/**
	 * 
	 */
	public OrderService() {

	}

	/**
	 * @param productDAO
	 * @param orderDAO
	 */
	public OrderService(IProductDAO productDAO, IOrderDAO orderDAO) {
		super();
		this.productDAO = productDAO;
		this.orderDAO = orderDAO;
	}

	@Autowired
	private IProductDAO productDAO;
	@Autowired
	private IOrderDAO orderDAO;

	
	
	// to init this method before use this object. the container will invoke this method after object instainlized.
	@PostConstruct
	public void initOrderservice() {
		
		
		System.out.println("****initOrderService()******");
	}
	
	
	
	@PreDestroy
	public void destoryOrderService() {
		
		System.out.println("*****destroy()*****");
		
		
	}
	
	
	
	
	
	
	@Override
	public boolean processOrder(Order order) {

		Product product = productDAO.findById(order.getProductId());

		if (order.getOderedQuantity() <= product.getQuantity()) {

			int updatedQuantity = product.getQuantity() - order.getOderedQuantity();

			product.setQuantity(updatedQuantity);

			productDAO.update(product);

			orderDAO.add(order);

			return true;
		}

		return false;
	}

	@Override
	public List<Product> fetchProducts() {

		return productDAO.findProducts();

	}

	@Override
	public List<Order> fetchOrders() {

		return orderDAO.findOrders();

	}

	
	
	
	// for bean life cycle method but not recommended use.
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

//	public void setProductDAO(IProductDAO productDAO) {
//		this.productDAO = productDAO;
//	}
//	
//	public void setOrderDAO(IOrderDAO orderDAO) {
//		this.orderDAO = orderDAO;
//	}
//	

}
