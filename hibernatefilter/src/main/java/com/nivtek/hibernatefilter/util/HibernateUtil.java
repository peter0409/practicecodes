package com.nivtek.hibernatefilter.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.nivtek.hibernatefilter.entity.AirConditioner;

public class HibernateUtil {

	private final static SessionFactory SESSION_FACTORY;

	static {

		// configuration object is used to bootstrap hibernate
		Configuration configuration = new Configuration();

		// loads hibernate.cfg.xml file from the classpath
		configuration.configure();

		configuration.addAnnotatedClass(AirConditioner.class);

		// we are starting essential hibernate services.
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {

		return SESSION_FACTORY;
	}
}
