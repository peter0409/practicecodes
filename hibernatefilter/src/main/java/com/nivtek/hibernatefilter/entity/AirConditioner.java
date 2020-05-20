package com.nivtek.hibernatefilter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "air_conditioner")
public class AirConditioner implements Serializable{
	
	@Id
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "capacity")
	private double capacity;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "has_discount")
	private boolean discount;
	
	
	

	/**
	 * @param name
	 * @param brand
	 * @param price
	 * @param category
	 * @param capacity
	 * @param rating
	 * @param discount
	 */
	public AirConditioner(String name, String brand, double price, String category, double capacity, int rating,
			boolean discount) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.capacity = capacity;
		this.rating = rating;
		this.discount = discount;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the capacity
	 */
	public double getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the discount
	 */
	public boolean isDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "AirConditioner [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", category="
				+ category + ", capacity=" + capacity + ", rating=" + rating + ", discount=" + discount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + (discount ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirConditioner other = (AirConditioner) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (discount != other.discount)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	/**
	 * @param id
	 * @param name
	 * @param brand
	 * @param price
	 * @param category
	 * @param capacity
	 * @param rating
	 * @param discount
	 */
	public AirConditioner(int id, String name, String brand, double price, String category, double capacity, int rating,
			boolean discount) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.capacity = capacity;
		this.rating = rating;
		this.discount = discount;
	}

	/**
	 * 
	 */
	public AirConditioner() {
		super();
	}
	
	

}
