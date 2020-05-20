/**
 * 
 */
package com.nivtek.corejava.datatypes.strings.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 017
 *
 */
public class IPaddressValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter IP address");

		String IPaddress = scanner.next();
		scanner.close();
		System.out.println("IP address is " + validateIPaddress(IPaddress));

	}

	public static String validateIPaddress(String IPaddress) {
		String regex = "(\\d{1,3}\\.){3}\\d{1,3}";
		
		boolean value = IPaddress.matches(regex);
		if (value) {
			return "valid";
		} else {
			return "not-valid";
		}
	}
}
