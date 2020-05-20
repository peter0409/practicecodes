package com.nivtek.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nivtek.hibernate.util.HibernateUtil;

public class TestInheritance {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		session.close();
		sessionFactory.close();
	}

}
