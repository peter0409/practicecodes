/**
 * 
 */
package com.nivket.collection.onlineclasspractice;

import java.util.Comparator;

/**
 * @author Bootcamp User 007
 *
 */
public class NameComparator implements Comparator<Apple> {

	@Override
	public int compare(Apple a1, Apple a2) {
		// TODO Auto-generated method stub
		return a1.getColor().compareTo(a2.getColor());
	}

}
