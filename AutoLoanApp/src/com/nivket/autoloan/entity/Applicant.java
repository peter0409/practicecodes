package com.nivket.autoloan.entity;

/**
 * @author Bootcamp User 007
 *
 */
public class Applicant {
	private String Name;
	private int ssn;
	private int income;
	private int vehiclePrice;
//getter and setter
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(int vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
}
