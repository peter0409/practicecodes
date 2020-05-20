package com.nivtek.corejava.multithreading.lab7;

public class TestClass {
	public static void main(String[] args) {
		Thread.currentThread().setName("MainThread");
		MyRunnable mr = new MyRunnable("MyRunnable");
		mr.run();
	}

}
