package com.nivtek.hibernate.app;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nivtek.hibernate.entity.Product;
import com.nivtek.hibernate.util.HibernateUtil;

public class TestCriteria {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);

		
		// select *from hibernate.product
		Root<Product> root = criteriaQuery.from(Product.class);

	
       //fetch all data from table
//		criteriaQuery.select(root);
		
		
		//fetch id is greater than 5
//		criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("id"), 2));
//		
		
		//fetch name with p
//		criteriaQuery.select(root).where(criteriaBuilder.like(root.get("name"), "p%"));
		
		
		//use more than one requirements
		criteriaQuery.select(root).where(criteriaBuilder.and(criteriaBuilder.gt(root.get("id"), 2),criteriaBuilder.like(root.get("name"), "p%")));
		
		

		Query<Product> query = session.createQuery(criteriaQuery);

		List<Product> products = query.list();

		for (Product product : products) {

			System.out.println(product);

		}

		session.close();

		sessionFactory.close();
	}

}
