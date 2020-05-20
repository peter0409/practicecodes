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

public class ACCriteriaService {

	protected List<String> brands;

	protected String categoryName;

	protected String priceRange;

	protected String minimumStar;

	protected String minimumCapacity;

	protected String ifDiscount;

	private boolean check;

	private StringBuilder sb;

	/**
	 * @return the brands
	 */
	public List<String> getBrands() {
		return brands;
	}

	/**
	 * @param brands the brands to set
	 */
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the priceRange
	 */
	public String getPriceRange() {
		return priceRange;
	}

	/**
	 * @param priceRange the priceRange to set
	 */
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	/**
	 * @return the minimumStar
	 */
	public String getMinimumStar() {
		return minimumStar;
	}

	/**
	 * @param minimumStar the minimumStar to set
	 */
	public void setMinimumStar(String minimumStar) {
		this.minimumStar = minimumStar;
	}

	/**
	 * @return the minimumCapacity
	 */
	public String getMinimumCapacity() {
		return minimumCapacity;
	}

	/**
	 * @param minimumCapacity the minimumCapacity to set
	 */
	public void setMinimumCapacity(String minimumCapacity) {
		this.minimumCapacity = minimumCapacity;
	}

	/**
	 * @return the ifDiscount
	 */
	public String getIfDiscount() {
		return ifDiscount;
	}

	/**
	 * @param ifDiscount the ifDiscount to set
	 */
	public void setIfDiscount(String ifDiscount) {
		this.ifDiscount = ifDiscount;
	}

	/**
	 * @return the check
	 */
	public boolean isCheck() {
		return check;
	}

	/**
	 * @param check the check to set
	 */
	public void setCheck(boolean check) {
		this.check = check;
	}

	/**
	 * @return the sb
	 */
	public StringBuilder getSb() {
		return sb;
	}

	/**
	 * @param sb the sb to set
	 */
	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}

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
