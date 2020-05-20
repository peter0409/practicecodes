package com.nivtek.hibernate.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="seller")
@PrimaryKeyJoinColumn(name="seller_id")
//@DiscriminatorValue("seller") for single table mapping inheritance
public class Seller extends User{
	
	@Column(name="max_items")
	private Long maxItemAllowed;
	
	@Column(name="commision_rate")
	private BigDecimal commisionRate;
	
	@OneToMany
	@JoinColumn(name="seller_id")
	private Set<Item> items;

	/**
	 * @return the maxItemAllowed
	 */
	public Long getMaxItemAllowed() {
		return maxItemAllowed;
	}

	/**
	 * @param maxItemAllowed the maxItemAllowed to set
	 */
	public void setMaxItemAllowed(Long maxItemAllowed) {
		this.maxItemAllowed = maxItemAllowed;
	}

	/**
	 * @return the commisionRate
	 */
	public BigDecimal getCommisionRate() {
		return commisionRate;
	}

	/**
	 * @param commisionRate the commisionRate to set
	 */
	public void setCommisionRate(BigDecimal commisionRate) {
		this.commisionRate = commisionRate;
	}

	/**
	 * @return the items
	 */
	public Set<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((commisionRate == null) ? 0 : commisionRate.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((maxItemAllowed == null) ? 0 : maxItemAllowed.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (commisionRate == null) {
			if (other.commisionRate != null)
				return false;
		} else if (!commisionRate.equals(other.commisionRate))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (maxItemAllowed == null) {
			if (other.maxItemAllowed != null)
				return false;
		} else if (!maxItemAllowed.equals(other.maxItemAllowed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [maxItemAllowed=" + maxItemAllowed + ", commisionRate=" + commisionRate + ", items=" + items
				+ "]";
	}

	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param userName
	 * @param passWord
	 * @param email
	 * @param address
	 * @param maxItemAllowed
	 * @param commisionRate
	 * @param items
	 */
	public Seller(Long userId, String firstName, String lastName, Date birthDate, String userName, String passWord,
			String email, Address address, Long maxItemAllowed, BigDecimal commisionRate, Set<Item> items) {
		super(userId, firstName, lastName, birthDate, userName, passWord, email, address);
		this.maxItemAllowed = maxItemAllowed;
		this.commisionRate = commisionRate;
		this.items = items;
	}

	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param userName
	 * @param passWord
	 * @param email
	 * @param address
	 */
	public Seller(Long userId, String firstName, String lastName, Date birthDate, String userName, String passWord,
			String email, Address address) {
		super(userId, firstName, lastName, birthDate, userName, passWord, email, address);
	}

	
}
