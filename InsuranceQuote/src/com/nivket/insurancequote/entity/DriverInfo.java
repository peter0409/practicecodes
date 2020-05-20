package com.nivket.insurancequote.entity;

public class DriverInfo {
	private String firstName;
	private String lastName;
	private String driverLicenseNumber;

	// TODO Auto-generated method stub

	public DriverInfo() {

	}

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

	public DriverInfo(String firstName, String lastName, String driverLicenseNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.driverLicenseNumber = driverLicenseNumber;
	}

}
