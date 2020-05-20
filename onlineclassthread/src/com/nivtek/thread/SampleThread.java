package com.nivtek.thread;

public class SampleThread extends Thread {

	@Override
	public void run() {

		
		
		System.out.println("run method thread name  "+Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {

			System.out.println(i);
		}

	}

}
