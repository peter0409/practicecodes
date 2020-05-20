package com.nivtek.corejava.basic.lab4;

public class RefactorMethodBeforeDemo {

	public static void main(String[] args) {
		String name = "Boot Camp";
		String city = "Dallas";
		String state = "TX";
		int i = 0;

		while (i < 3) {
			printInstructorDetails(name, city, state);
			i++;
		}

		printSum(5, 6);
		printSum(4, 7);

	}

	public static void printInstructorDetails(String name, String city, String state) {
		System.out.println("Hello, My name is " + name);
		System.out.println("I live in " + city + ", " + state);
		System.out.println("I am a java instructor");
		System.out.println("I work for Nivtek\n");

	}

	public static void printSum(int i, int j) {
		int k = i + j;
		System.out.println(k + "\n");
	}

}
