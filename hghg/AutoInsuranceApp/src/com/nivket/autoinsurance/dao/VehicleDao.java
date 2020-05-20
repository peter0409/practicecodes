package com.nivket.autoinsurance.dao;

import com.nivket.autoinsurance.entity.Vehicle;

/**
 * @author Bootcamp User 007
 *
 */
public class VehicleDao {

	public Vehicle getVehicle(String vin) {
//get vehicle information
		String model = vin.substring(0, vin.length() - 5);
		Vehicle vehicle = new Vehicle();
		vehicle.setModel(model);
		return vehicle;
	}

}
