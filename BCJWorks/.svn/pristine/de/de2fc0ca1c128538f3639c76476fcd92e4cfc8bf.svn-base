/**
 * 
 */
package com.nivtek.corejava.collections.lists.lab4;

import java.util.ArrayList;

/**
 * @author Bootcamp User 017
 *
 */
public class ReverseElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		String[] stringArray = { "how", "are", "you?" };

		for (String s : stringArray) {
			list.add(s);
		}

		System.out.println("Before reversing elements: " + list);
		reverseList(list);

	}

	public static void reverseList(ArrayList<String> list) {

		for (int j = 0; j < list.size(); j++) {
			String s = list.get(j);
			String temp = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				temp = temp + s.charAt(i);

			}
			list.set(j, temp);
		}
		System.out.println("After reversing elements: " + list);
	}

}
