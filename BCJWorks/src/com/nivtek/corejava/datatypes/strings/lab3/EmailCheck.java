/**
 * 
 */
package com.nivtek.corejava.datatypes.strings.lab3;

/**
 * @author Bootcamp User 017
 *
 */
public class EmailCheck {

	private static String emailId = "ah_jnvi@gam....il.com.";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (!(emailId.length() > 3 && emailId.length() < 20)) {
			System.out.println("Invalid length of email");
		}

		int count = 0;
		if (emailId.contains("@")) {
			for (int i = emailId.indexOf("@"); i < emailId.length(); i++) {
				if (emailId.charAt(i) == '.') {
					count++;
				}
			}

		} else {
			System.out.println("Invalid position of special characters");
		}
		if (count < 1 || count > 2) {
			System.out.println("Invalid position of special characters");
		}

		int index = emailId.indexOf('@');
		String subString = emailId.substring(0, index);
		boolean hasUppercase = !subString.equals(subString.toLowerCase());
		boolean hasLowercase = !subString.equals(subString.toUpperCase());
		boolean has_ = subString.contains("_");

		if (!hasLowercase || !hasUppercase || !has_) {
			System.out.println("Invalid combination of username");
		}

		if (!Character.isUpperCase(emailId.charAt(0))) {
			System.out.println("Invalid case of First Letter");
		}

	}
}
