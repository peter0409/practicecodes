package com.nivtek.hibernate.app;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nivtek.hibernate.entity.Product;
import com.nivtek.hibernate.entity.Supplier;
import com.nivtek.hibernate.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session =sessionFactory.openSession();
		
		Product product = session.get(Product.class, 2);
		
		Supplier supplier = product.getSupplier();
		
		
		System.out.println(product);
		System.out.println(supplier);
		
		
		Transaction transaction =session.getTransaction();
		
		transaction.begin();
		
		  session.save(new Product("peach",10,"ssdd",32));
		  
		  transaction.commit();
		  
		  session.close();
		  
		  sessionFactory.close();
		
//		
//		Product product =session.get(Product.class, 1);
//		
//		System.out.println(product);
//		
//		
//		session.close();
		
		sessionFactory.close();
		
		
	}

}
