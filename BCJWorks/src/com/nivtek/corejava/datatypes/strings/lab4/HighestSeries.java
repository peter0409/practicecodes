/**
 * 
 */
package com.nivtek.corejava.datatypes.strings.lab4;

import java.util.ArrayList;

/**
 * @author Bootcamp User 017
 *
 */
public class HighestSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "324, 457, 112, 259, 323, 222";
		ArrayList<Integer> maxNumArray = getNumbersWithHighestSum(input);
		for (int i = 0; i < maxNumArray.size(); i++) {
			System.out.println(maxNumArray.get(i));
		}

	}

	public static ArrayList<Integer> getNumbersWithHighestSum(String input) {
		String[] string = input.split(", ");
		int[] numbers = new int[string.length];
		int sumArray[] = new int[string.length];
		int sum = 0, max = 0, number;
		ArrayList<Integer> maxSum = new ArrayList<>();
		for (int i = 0; i < string.length; i++) {
			numbers[i] = Integer.parseInt(string[i]);
		}
		for (int j = 0; j < numbers.length; j++) {
			number = numbers[j];
			for (int i = 0; i < 3; i++) {
				sum = sum + number % 10;
				number = number / 10;
			}
			sumArray[j] = sum;
			sum = 0;
		}
		max = sumArray[0];
		for (int i = 0; i < sumArray.length; i++) {
			if (max < sumArray[i]) {
				max = sumArray[i];
			}
		}
		for (int i = 0; i < sumArray.length; i++) {
			if (max == sumArray[i]) {
				maxSum.add(numbers[i]);
			}
		}

		return maxSum;

	}

}
