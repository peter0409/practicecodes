/**
 * 
 */
package com.nivtek.corejava.collections.comparator.lab1;

import java.util.Comparator;

/**
 * @author Bootcamp User 017
 *
 */
public class AlternatingOrdering implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// default natural sorting order for positive numbers
		if (o1 >= 0) {
			return o1.compareTo(o2);
			// reverse order sorting for negative numbers
		} else {
			return -o1.compareTo(o2);
		}
	}

}
