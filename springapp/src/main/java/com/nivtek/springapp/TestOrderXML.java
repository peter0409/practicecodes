package com.nivtek.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nivtek.springapp.service.OrderService;
import com.nivtek.springapp.vo.Order;

public class TestOrderXML {
	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		OrderService orderService = applicationContext.getBean(OrderService.class);

		orderService.processOrder(new Order(111, 2, 10, "Urgent Delivery"));

		System.out.println();
		System.out.println("Product List  :");
		orderService.fetchProducts().stream().forEach(System.out::println);

		System.out.println();

		System.out.println("Orders list : ");
		orderService.fetchOrders().stream().forEach(System.out::println);
		
		
	}

}
