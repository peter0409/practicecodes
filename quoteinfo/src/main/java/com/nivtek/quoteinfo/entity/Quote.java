package com.nivtek.quoteinfo.entity;

import java.util.Date;

//@Entity
//@Table(name="quote")
public class Quote {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@Column(name="amount")
	private double amount;
	
//	@Column(name="quoteNumber")
	private int quoteNumber;
	
//	@Column(name="term")
	private int term;
	
//	@Column(name="date")
	private Date date;
	
//	@Column(name="customer")
	private Customer customer;

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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the quoteNumber
	 */
	public int getQuoteNumber() {
		return quoteNumber;
	}

	/**
	 * @param quoteNumber the quoteNumber to set
	 */
	public void setQuoteNumber(int quoteNumber) {
		this.quoteNumber = quoteNumber;
	}

	/**
	 * @return the term
	 */
	public int getTerm() {
		return term;
	}

	/**
	 * @param term the term to set
	 */
	public void setTerm(int term) {
		this.term = term;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + quoteNumber;
		result = prime * result + term;
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
		Quote other = (Quote) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (quoteNumber != other.quoteNumber)
			return false;
		if (term != other.term)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Quote [id=" + id + ", amount=" + amount + ", quoteNumber=" + quoteNumber + ", term=" + term + ", date="
				+ date + ", customer=" + customer + "]";
	}

	/**
	 * @param id
	 * @param amount
	 * @param quoteNumber
	 * @param term
	 * @param date
	 * @param customer
	 */
	public Quote(int id, double amount, int quoteNumber, int term, Date date, Customer customer) {
		super();
		this.id = id;
		this.amount = amount;
		this.quoteNumber = quoteNumber;
		this.term = term;
		this.date = date;
		this.customer = customer;
	}

	/**
	 * 
	 */
	public Quote() {
		super();
	}

	
	
}
