package com.nivtek.springapp.dao;


import java.util.List;

import com.nivtek.springapp.vo.Order;

public interface IOrderDAO {
   
	
	void add(Order order);
	Order findById(int id);
	List<Order> findOrders();
}
