package com.nivket.autoloan.service;

import java.text.DecimalFormat;
import java.util.Random;

import com.nivket.autoloan.dao.CreditScore;
import com.nivket.autoloan.entity.Bank;
import com.nivket.autoloan.entity.Request;

public class QuoteService {

	public void getQuote(Request request) {
		String name = request.getName();
		int ssn = request.getSsn();
		int vehiclePrice = request.getVehiclePrice();
		int income = request.getIncome();
		int term = request.getTerm();
		double apr = Bank.getApr();
		double amount = vehiclePrice;

		Random random = new Random();
		int quoteNumber = random.nextInt(189555500);
		CreditScore creditscore = new CreditScore();
		int score = creditscore.getCreditScore(ssn);

		// your score comparison
		if (vehiclePrice < income && score > 300 && score < 851) {
			if (score >= 300 && score <= 499) {

				amount = amount * 0.7;
				System.out.println("Sorry,you have very poor score,so" + name + " your monthly payment is "
						+ getMonthlyPayment(amount, apr, term) + " your quotenumber is " + quoteNumber);
			} else if (score >= 500 && score <= 600) {
				amount *= 0.8;
				System.out.println("Ok score," + name + " your monthly payment is "
						+ getMonthlyPayment(amount, apr, term) + " your quotenumber is " + quoteNumber);
			} else if (score >= 601 && score <= 660) {

				amount *= 0.9;
				System.out.println("Good score," + name + " your monthly payment is "
						+ getMonthlyPayment(amount, apr, term) + " your quotenumber is " + quoteNumber);
			} else if (score >= 661 && score <= 780) {
				amount *= 0.95;
				System.out.println("Wonderful score," + name + " your montly payment is "
						+ getMonthlyPayment(amount, apr, term) + " your quotenumber is " + quoteNumber);
			} else if (score > 781) {
				System.out.println("Excellent score, " + name + " your monthly payment is "
						+ getMonthlyPayment(amount, apr, term) + " your quotenumber is " + quoteNumber);
			}
		} else {

			System.out.println("Sorry, we can not loan money to you!");
		}

	}

	// get your method to monthlypayment
	public static double getMonthlyPayment(double amount, double apr, int term) {
		apr /= 1200;
		term *= 12;
		double monthlyPayment = amount * (apr * (Math.pow(1 + apr, term)) / (Math.pow(1 + apr, term) - 1));
		// format monthlypayment number into 2 decimal
		monthlyPayment = Double.parseDouble(new DecimalFormat("##.##").format(monthlyPayment));
		return monthlyPayment;

	}
}
