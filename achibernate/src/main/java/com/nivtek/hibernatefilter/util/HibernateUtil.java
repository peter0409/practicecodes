package com.nivtek.hibernatefilter.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.nivtek.hibernatefilter.entity.*;

public class HibernateUtil {

	private final static SessionFactory SESSION_FACTORY;

	static {

		// configuration object is used to bootstrap hiberate
		Configuration configuration = new Configuration();

		configuration.configure();

	
		configuration.addAnnotatedClass(AirConditioner.class);


		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {

		return SESSION_FACTORY;
	}

}
