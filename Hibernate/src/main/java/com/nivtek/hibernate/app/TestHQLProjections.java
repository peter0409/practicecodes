package com.nivtek.hibernate.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nivtek.hibernate.util.HibernateUtil;

public class TestHQLProjections {

	public static void main(String[] args) {
		
SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session =sessionFactory.openSession();
		
		Query<Object[]> query =session.createQuery("select p.name,p.price from Product p");
		
		List<Object[]> objectArrs =query.list();
		
		for(Object[] object : objectArrs) {
			
			System.out.println("name : " + object[0] );
			System.out.println("price : " + object[1] );
		}
	}

}
