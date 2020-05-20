/**
 * 
 */
package com.nivtek.corejava.collections.maps.lab1;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Bootcamp User 017
 *
 */
public class CityCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> input = new HashMap<String, String>();
		input.put("John", "Dallas");
		input.put("Babbar", "NewYork City");
		input.put("Akbar", "Houston");
		input.put("Rizwan", "Dallas");
		input.put("Jorge", "Paris");
		input.put("Roshan", "Dallas");
		input.put("Sujit", "Houston");

		System.out.println(input);
		System.out.println("output map:" + getCityCount(input));

	}

	/**
	 * @param input the map with person names and city they live in
	 * @return output the map with the city names (keys) and the count(values stored
	 *         as String) of the number of persons who live in the city
	 */
	public static HashMap<String, Integer> getCityCount(HashMap<String, String> input) {
		Collection<String> values = input.values();
		Set<String> valueSet = new HashSet<String>(values);
		HashMap<String, Integer> output = new HashMap<String, Integer>();

		for (String value : valueSet) {
			int count = 0;
			for (String s : values) {
				if (value.equals(s)) {
					count++;
				}
				output.put(value, count);
			}
		}

		return output;

	}

}
