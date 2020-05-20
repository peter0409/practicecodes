package com.nivtek.corejava.multithreading.lab5;

public class Test extends Thread {

	String msg = "default";

	public Test(String s) {
		msg = s;
	}

	public void run() {
		System.out.println(msg);
	}

	public static void main(String args[]) throws InterruptedException {
		Thread t1 = new Test("String1");
		Thread t2 = new Test("String2");
		t1.start();
		t2.start();
		t2.join();
		System.out.println("end");
	}

}
