package com.nivtek.corejava.flowcontrol.lab1;

public class ForLoop {
	public static void main(String args[]) {

		for (int i = 50; i < 80; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		int i = 50;
		while (i >= 50 && i < 80) {
			if (i % 2 == 0) {
				System.out.println("---------" +i);

			}
			i++;
		}

	}
}
