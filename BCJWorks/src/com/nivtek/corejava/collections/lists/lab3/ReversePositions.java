/**
 * 
 */
package com.nivtek.corejava.collections.lists.lab3;

import java.util.ArrayList;

/**
 * @author Bootcamp User 017
 *
 */
public class ReversePositions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		String[] stringArray = { "how", "are", "you?", "I", "am", "doing", "fine" };

		for (String s : stringArray) {
			list.add(s);
		}

		System.out.println("Initial list: " + list);
		reverseOddAndEvenList(list);

	}

	/**
	 * @param list the ArrayList of Strings
	 */
	public static void reverseOddAndEvenList(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<String>();
		for (int i = 0, j = 1; i < list.size(); i = i + 2, j = j + 2) {
			if (j < list.size()) {
				newList.add(i, list.get(j));
				newList.add(i + 1, list.get(j - 1));
			}
		}
		System.out.println("List after reversing order: " + newList);
	}

}
