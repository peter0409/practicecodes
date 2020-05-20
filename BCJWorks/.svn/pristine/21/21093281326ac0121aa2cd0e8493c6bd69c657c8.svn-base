package com.nivtek.corejava.collections.comparator.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		int listSize = 30;
		int magnitude = 500;
		Random rand = new Random(12345);

		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
		for (int i = 0; i < listSize; i++) {
			numbers.add(rand.nextInt() % magnitude);
		}

		Collections.sort(numbers);

		System.out.println("Default natural sorting order:");

		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();

		// backward ordering demo by passing BackwardOrdering object
		System.out.println("Backward ordering of default natural sorting order:");
		Collections.sort(numbers, new BackwardOrdering());
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();

		// alternate ordering demo by passing AlternatingdOrdering object
		System.out.println("Alternate ordering of default natural sorting order:");
		Collections.sort(numbers, new AlternatingOrdering());
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
