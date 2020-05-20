package com.nivket.insurancequote.dao;

public class ClaimDao {

	public int getClaim(String driverLicenseNumber) {
		char lastDigit = driverLicenseNumber.charAt(driverLicenseNumber.length() - 1);
		int result = Integer.valueOf(lastDigit);

		return result;
	}

}
