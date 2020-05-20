/**
 * 
 */
package com.nivtek.corejava.collections.lists.lab1;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Bootcamp User 017
 *
 */
public class DoubleListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] stringArray = { "how", "are", "you?" };
		ArrayList<String> input = new ArrayList<String>();
		for (String s : stringArray) {
			input.add(s);
		}
		System.out.println("List values before calling getDoubleList():" + input);

		ArrayList<String> output = getDoubleList(input);
		System.out.println("\nList values after calling getDoubleList():" + output);
	}

	/**
	 * @param input the arraylist of strings
	 * @return output the arraylist which has doubled string elements.
	 */
	public static ArrayList<String> getDoubleList(ArrayList<String> input) {
		ArrayList<String> output = new ArrayList<String>();
		ListIterator<String> listiterator = input.listIterator();

		while (listiterator.hasNext()) {
			String s = listiterator.next();
			output.add(s);
			output.add(s);
		}

		return output;
	}

}
