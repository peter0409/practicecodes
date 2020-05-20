package com.nivtek.corejava.multithreading.lab13;

public class TestClass {
	
	public static void main(String[] args)
	{
		Thread.currentThread().setName("First");
		MyRunnable mr = new MyRunnable("MyRunnable");
		mr.run();
		Thread.currentThread().setName("Second");
		mr.run();
	}

}
