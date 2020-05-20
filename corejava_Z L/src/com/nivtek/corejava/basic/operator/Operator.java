package com.nivtek.corejava.basic.operator;

import java.util.Scanner;

public class Operator {
	public static void getDivisionOperation(int dividend, int divisor) {
		float quotient = (float)dividend / divisor;
		float remainder = (float)dividend % divisor;

		System.out.println(quotient + "\t\t " + remainder);
	}
		

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Dividend: ");
			int dividend = scanner.nextInt();
			
			System.out.print("Enter the Divisor: ");
			int divisor = scanner.nextInt();
			
			scanner.close();
			System.out.println("Quotient \t Remainder");
			getDivisionOperation(dividend, divisor);
		}

	}



