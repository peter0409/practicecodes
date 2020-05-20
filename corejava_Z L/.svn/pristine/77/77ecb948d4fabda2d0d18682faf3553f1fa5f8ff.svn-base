package com.nikvet.corejava.basic.lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bootcamp User 007 peter
 */
public class FibonacciNumber {

	public static int[] findFibonacciNumber(int numOfSeq) {
		int[] fibonacciArray = new int[numOfSeq];
		int a = 0, b = 1, sum;
		for (int i = 0; i < numOfSeq; i++) {
			sum = a + b;
			a = b;
			b = sum;
			fibonacciArray[i] = sum;
		}

		return fibonacciArray;

	}

	public static void main(String[] args) {

		// get the number of Sequence you want from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int numOfSeq = scanner.nextInt();
		scanner.close();
		// call the method and print the array
		int[] fibonacciArray = findFibonacciNumber(numOfSeq);
		System.out.println("The Array of Fibonacci Sequence is: \n" + Arrays.toString(fibonacciArray));
	}

}
