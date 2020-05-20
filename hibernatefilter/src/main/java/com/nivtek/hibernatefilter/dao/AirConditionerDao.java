package com.nivtek.hibernatefilter.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nivtek.hibernatefilter.entity.AirConditioner;
import com.nivtek.hibernatefilter.service.ACCriteriaService;
import com.nivtek.hibernatefilter.util.HibernateUtil;

public class AirConditionerDao {
	public List<AirConditioner> getAirConditioners(ACCriteriaService filter) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Query query = filter.getQuery(session);

		List<AirConditioner> results = query.getResultList();

		session.close();

		return results;
	

}
}