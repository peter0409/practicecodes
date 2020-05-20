package com.nivtek.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="creditcard")
public class CreditCard {
	
	@Id
	private Long creditCardId;
	
	private String nameOnCard;
	
	private String accountNumber;
	
	private String expirationMonth;
	
	private String expirationYear;
	
	private String securityCode;

	/**
	 * @return the creditCardId
	 */
	public Long getCreditCardId() {
		return creditCardId;
	}

	/**
	 * @param creditCardId the creditCardId to set
	 */
	public void setCreditCardId(Long creditCardId) {
		this.creditCardId = creditCardId;
	}

	/**
	 * @return the nameOnCard
	 */
	public String getNameOnCard() {
		return nameOnCard;
	}

	/**
	 * @param nameOnCard the nameOnCard to set
	 */
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the expirationMonth
	 */
	public String getExpirationMonth() {
		return expirationMonth;
	}

	/**
	 * @param expirationMonth the expirationMonth to set
	 */
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	/**
	 * @return the expirationYear
	 */
	public String getExpirationYear() {
		return expirationYear;
	}

	/**
	 * @param expirationYear the expirationYear to set
	 */
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	/**
	 * @return the securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * @param securityCode the securityCode to set
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((creditCardId == null) ? 0 : creditCardId.hashCode());
		result = prime * result + ((expirationMonth == null) ? 0 : expirationMonth.hashCode());
		result = prime * result + ((expirationYear == null) ? 0 : expirationYear.hashCode());
		result = prime * result + ((nameOnCard == null) ? 0 : nameOnCard.hashCode());
		result = prime * result + ((securityCode == null) ? 0 : securityCode.hashCode());
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
		CreditCard other = (CreditCard) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (creditCardId == null) {
			if (other.creditCardId != null)
				return false;
		} else if (!creditCardId.equals(other.creditCardId))
			return false;
		if (expirationMonth == null) {
			if (other.expirationMonth != null)
				return false;
		} else if (!expirationMonth.equals(other.expirationMonth))
			return false;
		if (expirationYear == null) {
			if (other.expirationYear != null)
				return false;
		} else if (!expirationYear.equals(other.expirationYear))
			return false;
		if (nameOnCard == null) {
			if (other.nameOnCard != null)
				return false;
		} else if (!nameOnCard.equals(other.nameOnCard))
			return false;
		if (securityCode == null) {
			if (other.securityCode != null)
				return false;
		} else if (!securityCode.equals(other.securityCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardId=" + creditCardId + ", nameOnCard=" + nameOnCard + ", accountNumber="
				+ accountNumber + ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear
				+ ", securityCode=" + securityCode + "]";
	}

	/**
	 * @param creditCardId
	 * @param nameOnCard
	 * @param accountNumber
	 * @param expirationMonth
	 * @param expirationYear
	 * @param securityCode
	 */
	public CreditCard(Long creditCardId, String nameOnCard, String accountNumber, String expirationMonth,
			String expirationYear, String securityCode) {
		super();
		this.creditCardId = creditCardId;
		this.nameOnCard = nameOnCard;
		this.accountNumber = accountNumber;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
		this.securityCode = securityCode;
	}

	/**
	 * 
	 */
	public CreditCard() {
		super();
	}
	
	

}
