package com.nivket.chapter2datatypes;

public class ArrayAssignmentsPrintAverageNumber {

	public static void main(String[] args) {
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

		float amount = 0.0f;
		float a = 0.0f;
		//to find average
		for (int number : numbersArray) {
			amount += number;
			a = amount / numbersArray.length;
		}
		System.out.println("Average of Array is: " + a);
		
		System.out.println("NUMBERS LESS THAN AVERAGE");
		//to print numbers less than average
		for(int number: numbersArray) {
			if(number < a) {
				System.out.print(number + " ");
			}
		}

	}
}