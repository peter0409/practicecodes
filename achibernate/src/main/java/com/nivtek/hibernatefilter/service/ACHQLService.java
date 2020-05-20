package com.nivtek.hibernatefilter.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class ACHQLService {

	protected List<String> brands;

	protected String categoryName;

	protected String priceRange;

	protected String minimumStar;

	protected String minimumCapacity;

	protected String ifDiscount;

	private boolean check;
	
	private StringBuilder sb;

	public Query getQuery(Session session) {
		

		sb = new StringBuilder("from AirConditioner ac");
		
		if (brands == null && categoryName == null && priceRange == null && minimumStar == null
				&& minimumCapacity == null && ifDiscount == null)
			return session.createQuery(sb.toString());

		sb.append(" where");

		check = true;
		
		if (brands != null)
			setBrandsCondition();
		
		if (categoryName != null)
			setCategoryNameCondition();

		if (priceRange != null)
			setPriceRangeCondition();

		if (minimumStar != null)
			setMinimumStarCondition();

		if (minimumCapacity != null)
			setMinimunCapacityCondition();

		if (ifDiscount != null)
			setIfDiscountCondition();
	
		return session.createQuery(sb.toString());

	}

	/**
	 * @return the brands
	 */
	public List<String> getBrands() {
		return brands;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @return the priceRange
	 */
	public String getPriceRange() {
		return priceRange;
	}

	/**
	 * @return the minimumStar
	 */
	public String getMinimumStar() {
		return minimumStar;
	}

	/**
	 * @return the minimunCapacity
	 */
	public String getMinimunCapacity() {
		return minimumCapacity;
	}

	/**
	 * @return the ifDiscount
	 */
	public String getIfDiscount() {
		return ifDiscount;
	}

	/**
	 * @return the check
	 */
	public boolean isFirst() {
		return check;
	}

	/**
	 * @param brands the brands to set
	 */
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @param priceRange the priceRange to set
	 */
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	/**
	 * @param minimumStar the minimumStar to set
	 */
	public void setMinimumStar(String minimumStar) {
		this.minimumStar = minimumStar;
	}

	/**
	 * @param minimunCapacity the minimunCapacity to set
	 */
	public void setMinimunCapacity(String minimumCapacity) {
		this.minimumCapacity = minimumCapacity;
	}

	/**
	 * @param ifDiscount the ifDiscount to set
	 */
	public void setIfDiscount(String ifDiscount) {
		this.ifDiscount = ifDiscount;
	}

	/**
	 * @param check the check to set
	 */
	public void setFirst(boolean check) {
		this.check = check;
	}

	protected void setBrandsCondition() {

		if (check)
			sb.append(" ");
		else
			sb.append(" and ");

		sb.append("ac.brand in ('");

		for (int i = 0; i < brands.size(); i++) {

			sb.append(brands.get(i));

			if (i != brands.size() - 1)
				sb.append("','");
			else
				sb.append("')");
		}

		check = false;

	}

	protected void setCategoryNameCondition() {

		if (check)
			sb.append(" ");
		else
			sb.append(" and ");

		sb.append("ac.category='");
		sb.append(categoryName);
		sb.append("'");

		check = false;

	}

	protected void setPriceRangeCondition() {

		if (check)
			sb.append(" ");
		else
			sb.append(" and ");

		sb.append("ac.price<=");
		sb.append(priceRange);

		check = false;

	}

	protected void setMinimumStarCondition() {

		if (check)
			sb.append(" ");
		else
			sb.append(" and ");

		sb.append("ac.rating>=");
		sb.append(minimumStar);

		check = false;

	}

	protected void setMinimunCapacityCondition() {

		if (check)
			sb.append(" ");
		else
			sb.append(" and ");

		sb.append("ac.capacity>=");
		sb.append(minimumCapacity);

		check = false;

	}

	protected void setIfDiscountCondition() {

		if (check)
			sb.append(" ");
		else
			sb.append(" and ");

		sb.append("ac.discounted=");
		sb.append(ifDiscount);

		check = false;

	}

}
