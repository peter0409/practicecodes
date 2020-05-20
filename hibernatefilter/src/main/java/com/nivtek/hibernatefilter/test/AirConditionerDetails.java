package com.nivtek.hibernatefilter.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nivtek.hibernatefilter.entity.AirConditioner;
import com.nivtek.hibernatefilter.util.HibernateUtil;

public class AirConditionerDetails {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		session.save(new AirConditioner(1, "AC1", "LG", 3000.0, "Inventer AC", 1.5, 5, true));

		transaction.commit();

		transaction.begin();

		session.save(new AirConditioner(2, "AC2", "Daikin", 4000.0, "Window AC", 1.0, 4, false));

		transaction.commit();

		transaction.begin();

		session.save(new AirConditioner(3, "AC3", "BlueStar", 5000.0, "Portable AC", 1.3, 5, true));

		transaction.commit();

		session.close();

		sessionFactory.close();

	}

}
