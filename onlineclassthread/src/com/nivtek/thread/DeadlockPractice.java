package com.nivtek.thread;

public class DeadlockPractice extends Thread {

	A a = new A();

	B b = new B();

	public void m1() {

		this.start();
		System.out.println("5");
		
		a.d1(b); // this line executed by main thread
		
		System.out.println("6");
	}

	public void run() {
		
		System.out.println("7");
		
		b.d2(a); // this line executed by child thread
		
		System.out.println("8");
	}

	public static void main(String args[]) {

		DeadlockPractice dp = new DeadlockPractice();

		dp.m1();
	}
}
