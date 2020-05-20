package com.nivtek.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nivtek.springapp.dao.OrderDAO;
import com.nivtek.springapp.dao.ProductDAO;
import com.nivtek.springapp.dao.ProductDAOHib;
import com.nivtek.springapp.service.OrderService;

@Configuration
public class AppConfig {
	
	
	
	//if we do not write name here, the default name will be the method name.
	@Bean(name ="orderDAO")
	public OrderDAO getOrderDAO() {
		
		return new OrderDAO();
		
	}
	
	@Bean(name ="productDAO")
	public ProductDAO getProductDAO(){
		
		
		return new ProductDAO();
		
	}
	
	 @Bean(name ="productDAOHib")
	public ProductDAOHib getProductDAOHib() {
		
		
		return new ProductDAOHib();
	}
	
	@Bean(name ="orderService")
	public OrderService getOrderService() {
		
		return new OrderService();
	}
	
	

}
