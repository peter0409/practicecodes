package com.nivtek.hibernate.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nivtek.hibernate.entity.Product;
import com.nivtek.hibernate.util.HibernateUtil;

public class TestHQL {

	public static void main(String[] args) {
		
		
SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session =sessionFactory.openSession();
		
//		select whole result
//		Query<Product> query =session.createQuery("from Product");
		
		//same as first one
//		Query<Product> query =session.createQuery("select p from Product p");
		
		
		//positional bind parameters
//		Query<Product> query =session.createQuery("select p from Product p where p.id > ?0 and p.name like ?1");
//		
//		query.setParameter(0, 1);
//		query.setParameter(1, "v%");

		
		//the same as last one
		Query<Product> query =session.createQuery("select p from Product p where p.id > :pid and p.name like :pname");
		
		query.setParameter("pid", 1);     
		query.setParameter("pname", "p%");
		
		List<Product> products = query.list();
		
		products.forEach(System.out::println);
		
		session.close();
		sessionFactory.close();
	}

}
