package com.nivket.numberinput.results;

import java.util.Scanner;

/**
 * @author LeiZhao
 *
 */
public class NumberDemo {

	private void readInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your number");

	}

	/**
	 * This is Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		NumberDemo numberdemo = new NumberDemo();

		numberdemo.readInput();

		NumberLogic logic = new NumberLogic();

		logic.getLogic();
		
		//this is conflict buddy
		// now fix it :D
		
		// fix it mr Lin

	}

}
