package com.nivtek.hibernateapp.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nivtek.hibernateapp.entity.Category;
import com.nivtek.hibernateapp.entity.Employee;
import com.nivtek.hibernateapp.entity.Item;
import com.nivtek.hibernateapp.util.HibernateUtil;


public class HibernateTest {

	public static void main(String[] args) {

SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session =sessionFactory.openSession();
		
		
		testItem(session);
		testEmployee(session);
		testCategory(session);
	}

	private static void testCategory(Session session) {
Query<Category> query =session.createQuery("from Category");
		
		List<Category> categories = query.list();
		
		for(Category category : categories) {
			
			
			System.out.println(category);
		}				
	}

	private static void testEmployee(Session session) {
Query<Employee> query =session.createQuery("from Employee");
		
		List<Employee> employees = query.list();
		
		for(Employee employee : employees) {
			
			
			System.out.println(employee);
		}		
	}

	private static void testItem(Session session) {

		Query<Item> query =session.createQuery("from Item");
		
		List<Item> items = query.list();
		
		for(Item item : items) {
			
			
			System.out.println(item);
		}
	}

}
