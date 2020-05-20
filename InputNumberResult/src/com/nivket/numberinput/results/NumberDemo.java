package com.nivket.numberinput.results;

import java.util.Scanner;

public class NumberDemo {

	private void readInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your number");

	}

	public static void main(String[] args) {
		NumberDemo numberdemo = new NumberDemo();

		numberdemo.readInput();

		NumberLogic logic = new NumberLogic();

		logic.getLogic();

	}

}
