package com.nivket.autoinsurance.service;

import java.util.Random;

import com.nivket.autoinsurance.dao.VehicleDao;
import com.nivket.autoinsurance.entity.Request;

/**
 * @author Bootcamp User 007
 *
 */
public class QuoteService {

	public void getQuote(Request request) {
		String firstName = request.getFirstName();
		String lastName = request.getLastName();
		String driverLicenceNumber = request.getDriverLicenceNumber();
		String vin = request.getVin();
		int amount = 0;
		Random random = new Random();
		int quoteNumber = random.nextInt(189555500);
		// create object of VehicleDao class
		VehicleDao vehicleDao = new VehicleDao();
		String model = vehicleDao.getVehicle(vin).getModel();
		int numberOfClaim = Character.getNumericValue(driverLicenceNumber.charAt(driverLicenceNumber.length() - 1));
		int numberOfVoliation = Character.getNumericValue(driverLicenceNumber.charAt(2));

		// write business logic
		if (model.equalsIgnoreCase("BMN") || model.equalsIgnoreCase("Benz")) {

			amount += 200;
		} else {
			amount += 100;
		}
		if (numberOfClaim > 5) {

			amount += 300;

		} else {
			amount += 200;
		}

		if (numberOfVoliation > 3) {

			amount += 500;

		} else {
			amount += 200;
		}
		System.out.println("Hi" + firstName + lastName + " your quote number is " + quoteNumber
				+ " Your insurance cost is " + amount);

	}

}
