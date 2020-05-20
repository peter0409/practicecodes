/**
 * 
 */
package com.nivtek.corejava.collections.sets.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author Bootcamp User 017
 *
 */
class CounterAppTest {

	@Test
	public void countCommonTest() {
		int[] a1 = { 3, 7, 3, -1, 2, 3, 7, 2, 15, 15, 22 };
		int[] a2 = { -5, 15, 2, -1, 7, 15, 36, 22 };
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int expectedResult = 5;

		for (int a : a1) {
			list1.add(a);
		}

		for (int a : a2) {
			list2.add(a);
		}

		assertEquals(expectedResult, CounterApp.countCommon(list1, list2));

	}

}
