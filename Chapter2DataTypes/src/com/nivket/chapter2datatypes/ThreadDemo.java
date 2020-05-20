package com.nivket.chapter2datatypes;

public class ThreadDemo {

	public static void main(String[] args) {
//
//		new Thread(new Runnable() {
//		    @Override
//		    public void run() {
//		        System.out.println("howtodoinjava");
//		    }
//		}).start();
//		
//		
		
		
		Thread a = new Thread(() ->   { System.out.println("My Runnable"); });
		
		
		
		
		a.start();
	}

}
