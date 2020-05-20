package com.nivket.corejava.flowcontrol;

import java.util.Scanner;

class SalesPersonEarning {
	float a;
	int n;

	public void salesPeople() {
		
		Scanner input = new Scanner(System.in);
		float sum = 0;
		System.out.println("How many product you want to sold ? :");
		n = input.nextInt();
		
//		array of prices for products
		float a[] = new float[50];
		System.out.println("Enter prices of thats products: ");
		
		for (int i = 0; i < n; i++) {
			a[i] = input.nextFloat();

		}
		System.out.println("Total prices are: ");
		
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];

		}

		System.out.println(sum);
		
		float account;
		account = ((sum * 9) / 100) + 200;
		System.out.println("Earnings of this weak is " + "$" + account);

	}

	public static void main(String arg[]) {
		SalesPersonEarning a = new SalesPersonEarning();
		a.salesPeople();
	}

}