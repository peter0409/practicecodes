package com.nivtek.hibernate.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="bidder")
@PrimaryKeyJoinColumn(name="bidder_id")
//@DiscriminatorValue("bidder")     for single table mapping inheritance
public class Bidder extends User{
	
	@OneToMany
	@JoinColumn(name="bidder_id")
	private Set<Bid> bids;
	
	@OneToMany
	@JoinColumn(name="order_id")
	private Set<Order> orders;

	/**
	 * @return the bids
	 */
	public Set<Bid> getBids() {
		return bids;
	}

	/**
	 * @param bids the bids to set
	 */
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	/**
	 * @return the orders
	 */
	public Set<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bids == null) ? 0 : bids.hashCode());
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
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
		Bidder other = (Bidder) obj;
		if (bids == null) {
			if (other.bids != null)
				return false;
		} else if (!bids.equals(other.bids))
			return false;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bidder [bids=" + bids + ", orders=" + orders + "]";
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
	 * @param bids
	 * @param orders
	 */
	public Bidder(Long userId, String firstName, String lastName, Date birthDate, String userName, String passWord,
			String email, Address address, Set<Bid> bids, Set<Order> orders) {
		super(userId, firstName, lastName, birthDate, userName, passWord, email, address);
		this.bids = bids;
		this.orders = orders;
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
	public Bidder(Long userId, String firstName, String lastName, Date birthDate, String userName, String passWord,
			String email, Address address) {
		super(userId, firstName, lastName, birthDate, userName, passWord, email, address);
	}

	
	
}
