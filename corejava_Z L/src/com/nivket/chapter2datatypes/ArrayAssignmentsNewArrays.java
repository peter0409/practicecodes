package com.nivket.chapter2datatypes;

public class ArrayAssignmentsNewArrays {

	public static void main(String[] args) {
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int i = numbersArray.length;
		for (i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 != 0) {
				System.out.println(numbersArray[i]);
			}
		}

	}
}
