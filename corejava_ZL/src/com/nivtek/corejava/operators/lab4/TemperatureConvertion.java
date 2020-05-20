package com.nivtek.corejava.operators.lab4;

import java.util.Scanner;

public class TemperatureConvertion {
	private static float getTempCoversion(float cel) {
		float tempconversion = (cel * (9.0f / 5.0f)) + 32;
		return tempconversion;
	}

	private static float getcelsCoversion(float temp) {
		float celconversion = (temp - 32) * (5.0f / 9.0f);
		return celconversion;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter temperature");
		float temp = scanner.nextFloat();
		System.out.println("please enter celsius");
		float cel = scanner.nextFloat();
		scanner.close();
		getcelsCoversion(temp);
		getTempCoversion(cel);
		System.out.println(
				"your tempconversion " + getcelsCoversion(temp) + "\nyour celsiconversion " + getTempCoversion(cel));
	}

}
