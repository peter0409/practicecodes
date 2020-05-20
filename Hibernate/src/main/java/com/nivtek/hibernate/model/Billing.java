package com.nivtek.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Billing {
	
	
	@Id
	private Long billingId;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address billingAddress;
	
	
	@OneToOne
	@JoinColumn(name="creditCard_id")
	private CreditCard creditCard;


	/**
	 * @return the billingId
	 */
	public Long getBillingId() {
		return billingId;
	}


	/**
	 * @param billingId the billingId to set
	 */
	public void setBillingId(Long billingId) {
		this.billingId = billingId;
	}


	/**
	 * @return the billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}


	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}


	/**
	 * @return the creditCard
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}


	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billingAddress == null) ? 0 : billingAddress.hashCode());
		result = prime * result + ((billingId == null) ? 0 : billingId.hashCode());
		result = prime * result + ((creditCard == null) ? 0 : creditCard.hashCode());
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
		Billing other = (Billing) obj;
		if (billingAddress == null) {
			if (other.billingAddress != null)
				return false;
		} else if (!billingAddress.equals(other.billingAddress))
			return false;
		if (billingId == null) {
			if (other.billingId != null)
				return false;
		} else if (!billingId.equals(other.billingId))
			return false;
		if (creditCard == null) {
			if (other.creditCard != null)
				return false;
		} else if (!creditCard.equals(other.creditCard))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Billing [billingId=" + billingId + ", billingAddress=" + billingAddress + ", creditCard=" + creditCard
				+ "]";
	}


	/**
	 * @param billingId
	 * @param billingAddress
	 * @param creditCard
	 */
	public Billing(Long billingId, Address billingAddress, CreditCard creditCard) {
		super();
		this.billingId = billingId;
		this.billingAddress = billingAddress;
		this.creditCard = creditCard;
	}


	/**
	 * 
	 */
	public Billing() {
		super();
	}
	

}
