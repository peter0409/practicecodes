package com.nivket.insurancequote.entity;

public class VehicleInfo {

	private String vin;
	private String type;
	private String manufacture;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public VehicleInfo() {

	}

	public VehicleInfo(String vin, String type, String manufacture) {
		super();
		this.vin = vin;
		this.type = type;
		this.manufacture = manufacture;
	}

}
