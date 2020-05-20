package com.nivtek.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.nivtek.hibernate.model.Address;
import com.nivtek.hibernate.model.Bid;
import com.nivtek.hibernate.model.Bidder;
import com.nivtek.hibernate.model.Billing;
import com.nivtek.hibernate.model.Category;
import com.nivtek.hibernate.model.CreditCard;
import com.nivtek.hibernate.model.Item;
import com.nivtek.hibernate.model.Order;
import com.nivtek.hibernate.model.Seller;
import com.nivtek.hibernate.model.User;

public class HibernateUtil {

	private final static SessionFactory SESSION_FACTORY;

	static {

		// configuration object is used to bootstrap hibernate
		Configuration configuration = new Configuration();

		// loads hibernate.cfg.xml file from the classpath
		configuration.configure();
		
		configuration.addAnnotatedClass(Bid.class).addAnnotatedClass(Bidder.class).addAnnotatedClass(Billing.class).addAnnotatedClass(Category.class).addAnnotatedClass(CreditCard.class).addAnnotatedClass(Item.class).addAnnotatedClass(Order.class).addAnnotatedClass(Seller.class).addAnnotatedClass(User.class).addAnnotatedClass(Address.class);

		
		

//		configuration.addAnnotatedClass(Product.class);
//
//		configuration.addAnnotatedClass(Supplier.class);
		
		// we are starting essential hibernate services.
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {

		return SESSION_FACTORY;
	}
}
