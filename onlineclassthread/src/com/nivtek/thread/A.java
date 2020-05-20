package com.nivtek.thread;

public class A {

	public synchronized void d1(B b) {
		
		System.out.println("3");
		
		b.last();
		
		System.out.println("4");
	}

	public synchronized void last() {
	}

}
