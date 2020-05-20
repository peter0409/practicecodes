/**
 * 
 */
package com.nivtek.corejava.collections.lists.lab1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author Bootcamp User 017
 *
 */
class DoubleListTestClass {

	/**
	 * Test method for
	 * {@link com.nivtek.corejava.collections.lists.lab1.DoubleListDemo#getDoubleList(java.util.ArrayList)}.
	 */
	@Test
	void testGetDoubleList() {
		
		String[] stringArray = { "how", "are", "you?" };
		ArrayList<String> input = new ArrayList<String>();
		for (String s : stringArray) {
			input.add(s);
		}
		
		ArrayList<String> resultExpexted = new ArrayList<String>();
		for (String s : stringArray) {
			resultExpexted.add(s);
			resultExpexted.add(s);
		}
		
		System.out.println("Input list of strings "+stringArray);
		System.out.println("Expected list of strings "+resultExpexted);
		
		ArrayList<String> actual = DoubleListDemo.getDoubleList(input);
		
		assertEquals(resultExpexted, actual);
	

	}
}
