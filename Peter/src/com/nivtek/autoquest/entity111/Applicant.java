package com.nivtek.autoquest.entity111;

public class Applicant {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String ssn;
	private int address_id;
	private int employment_id;
	private int offer_id;

	/**
	 * 
	 */
	public Applicant() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phone
	 * @param ssn
	 * @param address_id
	 * @param employment_id
	 * @param offer_id
	 */
	public Applicant(String firstName, String lastName, String email, String phone, String ssn, int address_id,
			int employment_id, int offer_id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;

		this.ssn = ssn;
		this.address_id = address_id;
		this.employment_id = employment_id;
		this.offer_id = offer_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + address_id;

		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + employment_id;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + offer_id;
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
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
		Applicant other = (Applicant) obj;
		if (address_id != other.address_id)
			return false;

		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employment_id != other.employment_id)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (offer_id != other.offer_id)
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Applicant [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ ", ssn=" + ssn + ", address_id=" + address_id + ", employment_id=" + employment_id + ", offer_id="
				+ offer_id + "]";
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the date
	 */

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the address_id
	 */
	public int getAddress_id() {
		return address_id;
	}

	/**
	 * @param address_id the address_id to set
	 */
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	/**
	 * @return the employment_id
	 */
	public int getEmployment_id() {
		return employment_id;
	}

	/**
	 * @param employment_id the employment_id to set
	 */
	public void setEmployment_id(int employment_id) {
		this.employment_id = employment_id;
	}

	/**
	 * @return the offer_id
	 */
	public int getOffer_id() {
		return offer_id;
	}

	/**
	 * @param offer_id the offer_id to set
	 */
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}

}
