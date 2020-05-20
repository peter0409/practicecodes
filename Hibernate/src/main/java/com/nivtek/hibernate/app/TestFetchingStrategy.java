package com.nivtek.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nivtek.hibernate.entity.Supplier;
import com.nivtek.hibernate.util.HibernateUtil;

public class TestFetchingStrategy {
	
	
	public static void main(String[] args) {
		
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session =sessionFactory.openSession();
	
	
	Supplier supplier = session.get(Supplier.class, 1);
	
	 session.close();
	  
	  sessionFactory.close();

}
}