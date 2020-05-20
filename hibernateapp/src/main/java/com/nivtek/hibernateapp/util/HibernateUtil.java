package com.nivtek.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.nivtek.hibernateapp.entity.Category;
import com.nivtek.hibernateapp.entity.Employee;
import com.nivtek.hibernateapp.entity.Item;

public class HibernateUtil {

	private final static SessionFactory SESSION_FACTORY;

	static {

		// configuration object is used to bootstrap hibernate
		Configuration configuration = new Configuration();

		// loads hibernate.cfg.xml file from the classpath
		configuration.configure();

		configuration.addAnnotatedClass(Item.class).addAnnotatedClass(Employee.class).addAnnotatedClass(Category.class);

		// we are starting essential hibernate services.
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {

		return SESSION_FACTORY;
	}
}
