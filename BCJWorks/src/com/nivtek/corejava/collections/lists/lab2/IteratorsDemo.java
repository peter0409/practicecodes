/**
 * 
 */
package com.nivtek.corejava.collections.lists.lab2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Bootcamp User 017
 *
 */
public class IteratorsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("pear");
		fruits.add("banana");
		fruits.add("tangerine");
		fruits.add("strawberry");
		fruits.add("blackberry");
		
		System.out.println("elements are (in order of insertion)");
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("elements are (in reverse order)");
		ListIterator<String> listIterator = fruits.listIterator(fruits.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		fruits.add(3, "banana");
		System.out.println("second banana added; elements are:");
		Iterator<String> iterator2 = fruits.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
