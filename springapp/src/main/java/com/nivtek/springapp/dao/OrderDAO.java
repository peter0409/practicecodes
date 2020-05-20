package com.nivtek.springapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nivtek.springapp.dbstore.MySQLDBStore;
import com.nivtek.springapp.vo.Order;


@Repository
public class OrderDAO implements IOrderDAO {

	private List<Order> ordersList;
	
	public 	OrderDAO() {
		
		ordersList = MySQLDBStore.ODERS;
		
	}
	
	
	
	
	@Override
	public void add(Order order) {
ordersList.add(order);
}

	@Override
	public Order findById(int id) {
		// TODO Auto-generated method stub
		return ordersList.stream().filter(order->order.getId()==id).findFirst().get();
	}

	@Override
	public List<Order> findOrders() {
		// TODO Auto-generated method stub
		return ordersList;
	}

}
