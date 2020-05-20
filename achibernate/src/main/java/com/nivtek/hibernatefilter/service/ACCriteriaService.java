package com.nivtek.hibernatefilter.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nivtek.hibernatefilter.entity.AirConditioner;

public class ACCriteriaService extends ACHQLService {

	@Override
	public Query getQuery(Session session) {

		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<AirConditioner> criteriaQuery = builder.createQuery(AirConditioner.class);
		
		Root<AirConditioner> root = criteriaQuery.from(AirConditioner.class);
		
		List<Predicate> predicates = new ArrayList<>();

		criteriaQuery.select(root);

		if (brands == null && categoryName == null && priceRange == null && minimumStar == null
				&& minimumCapacity == null && ifDiscount == null)
			return session.createQuery(criteriaQuery);

		if (brands != null)
			predicates.add(builder.and(root.get("brand").in(brands)));

		if (categoryName != null)
			predicates.add(builder.equal(root.get("category"), categoryName));

		if (priceRange != null)
			predicates.add(builder.le(root.get("price"), Double.parseDouble(priceRange)));

		if (minimumStar != null)
			predicates.add(builder.ge(root.get("rating"), Double.parseDouble(minimumStar)));

		if (minimumCapacity != null)
			predicates.add(builder.ge(root.get("capacity"), Double.parseDouble(minimumCapacity)));

		if (ifDiscount != null)
			predicates.add(builder.equal(root.get("has_discount"), Boolean.parseBoolean(ifDiscount)));

		criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()]));

		Query<AirConditioner> query = session.createQuery(criteriaQuery);

		return query;
	}

}
