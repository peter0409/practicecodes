package com.nivket.chapter2datatypes;

public class ArrarAssignmentsPrintSum {

	public static void main(String[] args) {
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		
		int sum = 0;
		
		for (int number : numbersArray) {
			
			sum +=number;
			
//			if (number % 3 == 0) {
//
//				System.out.println(number);
//
//			}

		}
		System.out.print(sum);

	}

}
