/**
 * 
 */
package com.nivtek.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nivtek.springapp.service.OrderService;
import com.nivtek.springapp.vo.Order;

/**
 * @author Bootcamp User 007
 *
 */
public class TestOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.nivtek.springapp");
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
