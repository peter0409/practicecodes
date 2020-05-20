package com.nivtek.corejava.basic.lab1;

public class HelloWorld {

	public static void main(String[] args) {
		
		String firstname = args[0];
		String lastname = args[1];
		int age = Integer.parseInt(args[2]);

		System.out.println("My name is " + firstname + " " + lastname + " and my age is " + age);
	}

}
