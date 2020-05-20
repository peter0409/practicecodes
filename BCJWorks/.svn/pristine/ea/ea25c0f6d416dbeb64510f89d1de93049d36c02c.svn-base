/**
 * 
 */
package com.nivtek.corejava.collections.maps.lab2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Bootcamp User 017
 *
 */
public class FrequencyAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> input = new HashMap<String, Integer>();
		input.put("John", 22);
		input.put("Babbar", 25);
		input.put("Akbar", 25);
		input.put("Rizwan", 20);
		input.put("Jorge", 20);
		input.put("Roshan", 20);
		input.put("Sujit", 25);
		input.put("Ryan", 25);
		input.put("Stef", 22);

		System.out.println("The less frequent age is :" + getRarest(input));

	}

	public static int getRarest(Map<String, Integer> input) {
		Collection<Integer> values = input.values();
		Set<Integer> valueSet = new HashSet<Integer>(values);
		HashMap<Integer, Integer> valueNcount = new HashMap<Integer, Integer>();

		for (int value : valueSet) {
			int count = 0;
			for (int s : values) {
				if (value == s) {
					count++;
				}
			}
			valueNcount.put(value, count);
		}

		Collection<Integer> counts = valueNcount.values();
		Set<Integer> countSet = new HashSet<Integer>(counts);
		int minCount = input.size();
		for (int i : countSet) {
			if (i < minCount) {
				minCount = i;
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int value : valueNcount.keySet()) {
			if (minCount == valueNcount.get(value)) {
				list.add(value);
			}

		}

		int output = list.get(0);
		if (list.size() > 0) {
			for (int i : list) {
				if (i < output) {
					output = i;
				}
			}
		}

		return output;

	}

}
