package com.nivket.autoinsurance.entity;

/**
 * @author Bootcamp User 007
 *
 */
public class Request {
	private String firstName;
	private String lastName;
	private String DriverLicenceNumber;
	private String vin;

//setter and getter
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

	public String getDriverLicenceNumber() {
		return DriverLicenceNumber;
	}

	public void setDriverLicenceNumber(String driverLicenceNumber) {
		DriverLicenceNumber = driverLicenceNumber;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}
