package com.nivket.insurancequote.dao;

public class ViolationDao {

	public int getViolation(String driverLicenseNumber) {

		char firstDigit = driverLicenseNumber.charAt(0);
		int result = Integer.valueOf(firstDigit);
		return result;

	}

}
