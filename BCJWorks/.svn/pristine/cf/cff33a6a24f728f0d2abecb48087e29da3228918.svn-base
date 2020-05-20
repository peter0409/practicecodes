/**
 * 
 */
package com.nivtek.corejava.datatypes.strings.lab5;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Bootcamp User 017
 *
 */
public class PhoneNumberValidator {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * System.out.println("Enter phone number"); BufferedReader reader = new
		 * BufferedReader(new InputStreamReader(System.in)); String phoneNumber =
		 * reader.readLine(); System.out.println("phone number is " +
		 * validatePhoneNumber(phoneNumber));
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your phone number");
		String phoneNumber = scanner.nextLine();

		System.out.println("phone number is " + validatePhoneNumber(phoneNumber));
		scanner.close();

	}

	public static String validatePhoneNumber(String phoneNumber) {
		String regex1 = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
		String regex2 = "[0-9]{3}\\.[0-9]{3}\\.[0-9]{4}";
		String regex3 = "[0-9]{3}\\s[0-9]{3}\\s[0-9]{4}";
		boolean value = phoneNumber.matches(regex1) || phoneNumber.matches(regex2) || phoneNumber.matches(regex3);
		if (value) {
			return "valid";
		} else {
			return "not-valid";
		}

	}

}
