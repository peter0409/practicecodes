/**
 * 
 */
package com.nivtek.corejava.datatypes.arrays.lab1;

import java.util.Arrays;

/**
 * @author Bootcamp User 007
 *
 */
public class ArrayManipulationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

		printOddNumbers(numbersArray);

		printDivisibleOfThree(numbersArray);

		printEvenAndIncrease(numbersArray);

		printMaxMinNum(numbersArray);

	}

	/**
	 * This method prints the max and min numbers from the array
	 * 
	 * @param numbersArray
	 */
	private static void printMaxMinNum(int[] numbersArray) {

		Arrays.sort(numbersArray);
		System.out.println("max number: " + numbersArray[numbersArray.length - 1]);
		System.out.println("lowest number: " + numbersArray[0]);

	}

	/**
	 * This method prints even numbers and increases all even numbers by 2
	 * 
	 * @param numbersArray
	 */
	private static void printEvenAndIncrease(int[] numbersArray) {

		int i = numbersArray.length;
		int[] output = new int[numbersArray.length];
		System.out.println("\nPrint Even Numbers and Increase by 2");

		for (i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 == 0) {
				output[i] = numbersArray[i] + 2;
			} else {
				output[i] = numbersArray[i];
			}
		}

		System.out.println(Arrays.toString(output));

	}

	/**
	 * This method prints divisible of 3
	 * 
	 * @param numbersArray
	 */
	private static void printDivisibleOfThree(int[] numbersArray) {
		int sum = 0;

		System.out.println("\nNumbersDivisible of Three");
		for (int number : numbersArray) {

			sum += number;

			if (number % 3 == 0) {

				System.out.print(number + " ");

			}

		}
	}

	/**
	 * This method prints odd numbers in array
	 * 
	 * @param numbersArray
	 */
	private static void printOddNumbers(int[] numbersArray) {
		int i = numbersArray.length;
		System.out.println("Odd Numbers in Array");
		for (i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 != 0) {
				System.out.print(numbersArray[i] + " ");
			}
		}

	}

}
