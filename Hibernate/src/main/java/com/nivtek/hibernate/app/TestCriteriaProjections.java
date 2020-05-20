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

public class TestCriteriaProjections {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		
		
		Root<Product> root=criteriaQuery.from(Product.class);
		
		criteriaQuery.multiselect(root.get("name"),root.get("price"));
		
		Query<Object[]> query = session.createQuery(criteriaQuery);
		
		List<Object[]> objectArrs = query.list();
		
		for(Object[] objects : objectArrs) {
			
			System.out.println("Name : " +objects[0]);
			System.out.println("price : " +objects[1]);
			System.out.println();
			
			
		}
		
		session.close();
		sessionFactory.close();
	}

}
