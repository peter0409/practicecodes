package com.nivtek.quote.nameandaddress.model;

public class NameAndAddress {
	
	
	private String id;
	private MailingInfo mailingInfo;
	private String firstName;
	private String lastName;
	private String DOB;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the mailingInfo
	 */
	public MailingInfo getMailingInfo() {
		return mailingInfo;
	}
	/**
	 * @param mailingInfo the mailingInfo to set
	 */
	public void setMailingInfo(MailingInfo mailingInfo) {
		this.mailingInfo = mailingInfo;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dOB
	 */
	public String getDOB() {
		return DOB;
	}
	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mailingInfo == null) ? 0 : mailingInfo.hashCode());
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
		NameAndAddress other = (NameAndAddress) obj;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mailingInfo == null) {
			if (other.mailingInfo != null)
				return false;
		} else if (!mailingInfo.equals(other.mailingInfo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "NameAndAddress [id=" + id + ", mailingInfo=" + mailingInfo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", DOB=" + DOB + "]";
	}
	/**
	 * @param id
	 * @param mailingInfo
	 * @param firstName
	 * @param lastName
	 * @param dOB
	 */
	public NameAndAddress(String id, MailingInfo mailingInfo, String firstName, String lastName, String dOB) {
		super();
		this.id = id;
		this.mailingInfo = mailingInfo;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
	}
	/**
	 * 
	 */
	public NameAndAddress() {
		super();
	}



}