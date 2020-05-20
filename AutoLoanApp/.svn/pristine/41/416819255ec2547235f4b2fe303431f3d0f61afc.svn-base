package com.nivket.autoloan.appdemo;

import java.util.Scanner;

import com.nivket.autoloan.entity.Request;
import com.nivket.autoloan.quotecontroller.QuoteController;

/**
 * @author Bootcamp User 007
 *
 */
public class AutoLoanAppDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = input.nextLine();
		System.out.println("Please enter your SSN");
		int ssn = input.nextInt();

		System.out.println("Please enter your annual income");
		int income = input.nextInt();
		System.out.println("Please enter your vehilcePrice");
		int vehiclePrice = input.nextInt();
		System.out.println("Please enter your desired loan term");
		int term=input.nextInt();
		input.close();
		Request request = new Request();
		request.setName(name);
		request.setSnn(ssn);
		request.setIncome(income);
		request.setVehiclePrice(vehiclePrice);
		request.setTerm(term);

		QuoteController quotecontroller = new QuoteController();
		quotecontroller.getQuote(request);

	}

}
