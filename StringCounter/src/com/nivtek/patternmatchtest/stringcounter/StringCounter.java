package com.nivtek.patternmatchtest.stringcounter;

import java.util.Scanner;

/**
 * @author Bootcamp User 007
 *
 */
public class StringCounter {

	public String readInput() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter your string: ");

		String userInputString = scan.nextLine();

		scan.close();

		return userInputString;

	}

	/**
	 * @param str
	 */
	public String getPrint(String word) {
		String outputString;

		if ( word == null || word.length() <= 2) {

			return word;

		} else {

			int num = word.length() - 2;
			
			outputString =  Character.toString(word.charAt(0)) + num + word.charAt(word.length() - 1);
		}
		return outputString;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str;

		StringCounter stc = new StringCounter();

		str = stc.readInput();

		System.out.println(stc.getPrint(str));

	}
}
