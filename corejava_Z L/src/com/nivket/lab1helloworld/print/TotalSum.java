package com.nivket.lab1helloworld.print;

import java.util.Scanner;

public class TotalSum {

	public int getSum(int x) {

		int sum = 0;
		for (int i = 0; i < x; i++) {
			if (i % 3 == 0 || i % 5 == 0) {

				sum = sum + i;

			}

		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		TotalSum a = new TotalSum();
		System.out.println("Please enter your random number");
		int m = input.nextInt();
		a.getSum(m);
	}

}
