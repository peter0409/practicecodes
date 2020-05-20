package com.nivket.autoinsurance.demo;

import java.util.Scanner;

import com.nivket.autoinsurance.cotroller.QuoteController;
import com.nivket.autoinsurance.entity.Request;

/**
 * @author Bootcamp User 007
 *
 */
public class AutoInsuranceApp {
//set scanner to put your data
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName = input.nextLine();

		System.out.println("Please enter your last name");
		String lastName = input.nextLine();

		System.out.println("Please enter your DriverLicenceNumber");
		String DriverLicenceNumber = input.nextLine();

		System.out.println("Please enter your VIN");
		String vin = input.nextLine();
		input.close();
		// create object for Request class
		Request request = new Request();
		request.setFirstName(firstName);
		request.setLastName(lastName);
		request.setVin(vin);
		request.setDriverLicenceNumber(DriverLicenceNumber);

		QuoteController quoteController = new QuoteController();
		quoteController.getQuote(request);

	}

}
