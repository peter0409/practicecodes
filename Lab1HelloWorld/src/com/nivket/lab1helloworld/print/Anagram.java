package com.nivket.lab1helloworld.print;

import java.util.Arrays;

public class Anagram {
	public static void main(String arg[]) {

		String a = "peter";
		String b = "peetr";
		char[] ch = a.toCharArray();
		char[] ch1 = b.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);

		if (Arrays.toString(ch).equals(Arrays.toString(ch1))) {
			System.out.println("Yes Anagram");

		} else

			System.out.println("No");

	}
}
