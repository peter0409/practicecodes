package com.nivket.insurancequote.entity;

public class RequestInfo {
	private String firstName;
	private String lastName;
	private String driverLicenseNumber;
	private String vin;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public RequestInfo() {

	}

	public RequestInfo(String firstName, String lastName, String driverLicenseNumber, String vin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.driverLicenseNumber = driverLicenseNumber;
		this.vin = vin;
	}
}