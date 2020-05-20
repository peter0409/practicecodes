package com.nivket.autoinsurance.entity;

/**
 * @author Bootcamp User 007
 *
 */
public class Vehicle {
	private String vin;
	private String model;
	private String manufacture;

//setter and getter
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

}
