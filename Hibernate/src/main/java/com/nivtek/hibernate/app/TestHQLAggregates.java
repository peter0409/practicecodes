package com.nivtek.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nivtek.hibernate.util.HibernateUtil;

public class TestHQLAggregates {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Query<Float> query = session.createQuery("select max(p.price) from Product p");
		
		Float price = query.getSingleResult();
		
		System.out.println("max price : " + price );
		
		session.close();
		sessionFactory.close();
		
		
	}

}
