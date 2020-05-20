/**
 * 
 */
package com.nivtek.corejava.collections.sets.lab1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Bootcamp User 017
 *
 */
public class CounterApp {

	public static int countCommon(List<Integer> list1, List<Integer> list2) {
		Set<Integer> set1 = new HashSet<Integer>(list1);
		Set<Integer> set2 = new HashSet<Integer>(list2);

		int count = 0;
		for (int i : set1) {
			for (int j : set2) {
				if (i == j) {
					count++;
				}
			}
		}

		return count;
	}

}
