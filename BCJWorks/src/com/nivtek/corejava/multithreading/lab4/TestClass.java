package com.nivtek.corejava.multithreading.lab4;

public class TestClass extends Thread {

	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Hi");
		}
	}

	public static void main(String args[]) {
		System.out.println("Starting main");
		new TestClass().start();
		System.out.println("Main returns");
	}

}
