package com.nivtek.springapp.service;

import java.util.List;

import com.nivtek.springapp.vo.Order;
import com.nivtek.springapp.vo.Product;

public interface IOrderService {
	
	
	boolean processOrder(Order order);
	
	List<Product> fetchProducts();
	List<Order> fetchOrders();

}
