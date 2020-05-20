package com.nivtek.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="address")
public class Address {

	@Id
	private int addressId;
	
	private String streetName1;
	
	private String streetName2;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	private String phone;

	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the streetName1
	 */
	public String getStreetName1() {
		return streetName1;
	}

	/**
	 * @param streetName1 the streetName1 to set
	 */
	public void setStreetName1(String streetName1) {
		this.streetName1 = streetName1;
	}

	/**
	 * @return the streetName2
	 */
	public String getStreetName2() {
		return streetName2;
	}

	/**
	 * @param streetName2 the streetName2 to set
	 */
	public void setStreetName2(String streetName2) {
		this.streetName2 = streetName2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressId;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetName1 == null) ? 0 : streetName1.hashCode());
		result = prime * result + ((streetName2 == null) ? 0 : streetName2.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
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
		Address other = (Address) obj;
		if (addressId != other.addressId)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetName1 == null) {
			if (other.streetName1 != null)
				return false;
		} else if (!streetName1.equals(other.streetName1))
			return false;
		if (streetName2 == null) {
			if (other.streetName2 != null)
				return false;
		} else if (!streetName2.equals(other.streetName2))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetName1=" + streetName1 + ", streetName2=" + streetName2
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", phone=" + phone + "]";
	}

	/**
	 * @param addressId
	 * @param streetName1
	 * @param streetName2
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param phone
	 */
	public Address(int addressId, String streetName1, String streetName2, String city, String state, String zipcode,
			String phone) {
		super();
		this.addressId = addressId;
		this.streetName1 = streetName1;
		this.streetName2 = streetName2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
	}

	/**
	 * 
	 */
	public Address() {
		super();
	}
	
	
}
