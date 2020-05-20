package com.nivtek.hibernate.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nivtek.hibernate.entity.Product;
import com.nivtek.hibernate.entity.Supplier;
import com.nivtek.hibernate.util.HibernateUtil;

public class TestHQLJoin {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		
		//inner join 
		Query<Object[]> query = session.createQuery("select p,s from Product p inner join p.supplier s");
		
		
		//outer join left
//		Query<Object[]> query = session.createQuery("select p,s from Product p left outer join p.supplier s");

		List<Object[]> list = query.list();

		for (Object[] objects : list) {

			Product product = (Product) objects[0];

			Supplier supplier = (Supplier) objects[1];

			System.out.println(product);

			System.out.println(supplier);

		}
		session.close();
		sessionFactory.close();
	}

}
