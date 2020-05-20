package com.nivtek.corejava.basic.operator;

public class MoonWeight {

	public static void main(String[] args) {
		float a = 134.87f;
		float b = getWeight(a, 0.17);
		System.out.println(b);

	}

	private static float getWeight(float number, double rate) {
		float b = (float) (number * rate);
		return b;

	}

}
