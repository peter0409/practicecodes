package com.nivtek.thread;

public class B {

	public synchronized void d2(A a) {
		
		System.out.println("1");
		
		a.last();
		
		System.out.println("2");
	}

	public synchronized void last() {

	}

}
