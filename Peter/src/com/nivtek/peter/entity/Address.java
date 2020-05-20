package com.nivtek.peter.entity;

public class Address {

	private String addressLineOne;
	private int suiteNumber;
	private String city;
	private String state;
	private int zipCode;

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public int getSuiteNumber() {
		return suiteNumber;
	}

	public void setSuiteNumber(int suiteNumber) {
		this.suiteNumber = suiteNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
