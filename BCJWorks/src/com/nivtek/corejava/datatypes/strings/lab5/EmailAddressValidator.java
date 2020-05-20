/**
 * 
 */
package com.nivtek.corejava.datatypes.strings.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bootcamp User 017
 *
 */
public class EmailAddressValidator {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter email address");
		String EmailAddress = reader.readLine();
		System.out.println("email address is " + validateEmailAddress(EmailAddress));

	}

	public static String validateEmailAddress(String EmailAddress) {
		String regex = "[A-Za-z]+@[A-Za-z]+\\.com";

		boolean value = EmailAddress.matches(regex);
		if (value) {
			return "valid";
		} else {
			return "not-valid";
		}
	}
}
