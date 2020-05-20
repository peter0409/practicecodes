package com.nivket.travelportal.demo;

import java.util.Scanner;

import com.nivket.travelportal.controller.VacationChoiceController;
import com.nivket.travelportal.entity.CustomerInfo;

/**
 * @author Bootcamp User 007
 *
 */
public class VacationPortalDemo {

	private static CustomerInfo customer = new CustomerInfo();

	public static void readInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your firstName ");
		String firstName = scanner.nextLine();

		System.out.println("Please enter your lastName ");
		String lastName = scanner.nextLine();

		System.out.println("Please enter your age ");
		int age = scanner.nextInt();

		System.out.println("Please enter your occupation ");
		String occupation = scanner.next();

//		close scanner
		scanner.close();
//		create object of class CustomerInfo and set customer details
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setAge(age);
		customer.setOccupation(occupation);

	}

	public static void main(String[] args) {

		readInput();

        //	create object of class VacationChoiceController and call method
		VacationChoiceController vacationChoice = new VacationChoiceController();
		vacationChoice.getVacationChoice(customer);

	}

}
