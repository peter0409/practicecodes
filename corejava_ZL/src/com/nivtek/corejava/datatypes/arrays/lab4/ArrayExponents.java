package com.nivtek.corejava.datatypes.arrays.lab4;

import java.util.Scanner;

public class ArrayExponents {
	public static int[] powOfTwo(int powTwo) {
		int[] baseTwoByN = new int[powTwo];
		int base = 2, count = 0;

		if (powTwo == 0) {
			baseTwoByN[powTwo] = 1;

		} else {
			while (count < powTwo) {
				baseTwoByN[count] = calculatePow(base, count);
				count++;
			}

		}

		return baseTwoByN;
	}

	/**
	 * @param base
	 * @param power
	 * @return base ^ power
	 */
	public static int[] power(int base, int power) {
		int[] baseRaisedPower = new int[power];

		for (int i = 0; i < power; i++) {
			baseRaisedPower[i] = calculatePow(base, i);
		}

		return baseRaisedPower;
	}

	/**
	 * @param base
	 * @param count
	 * @return base ^ count
	 */
	private static int calculatePow(int base, int count) {
		int result = 1;
		for (int i = 1; i <= count; i++) {
			result *= base;
		}

		return result;
	}

	/**
	 * Prints the Power Results from Array
	 * 
	 * @param base
	 * @param power
	 * @param result
	 */
	private static void printResult(int base, int power, int[] result) {
		for (int i = 0; i < power; i++) {
			System.out.println(base + "^" + i + " = " + result[i]);
		}
	}

	public static void main(String[] args) {

		// get the power to be raised for base number from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Power to be raised for Base 2: ");
		int powTwo = scanner.nextInt();

		// now call the logic to increase base 2 by this power
		int[] baseTwoByN = powOfTwo(powTwo);

		// print the power of two raised by input number
		printResult(2, powTwo, baseTwoByN);

		// get the base and power here
		System.out.print("\n-----------\nPART TWO!!\n" + "Enter the Base: ");
		int base = scanner.nextInt();

		System.out.print("Enter the Power: ");
		int power = scanner.nextInt();
		
		scanner.close();

		// call the method to pass base and power to return the power raised
		int[] baseBaseByPower = power(base, power);
		printResult(base, power, baseBaseByPower);
	}

}
