package com.nivket.exceptionhandling.pratice;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {

			String s1 = new String("HEELO GOOD ");

			s1 = null;

			System.out.println(s1.length());
			System.out.println("done reading length");
		} catch (NullPointerException e) {

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch block");

		}

		System.out.println("end of email");

	}
}
