package com.nivtek.thread;

public class TestRunnable {

	public static void main(String[] args) {

		/*
		 * SampleRunnable sr = new SampleRunnable();
		 * 
		 * Thread thread = new Thread(sr);
		 * 
		 * thread.setName("testthread"); thread.start();
		 * 
		 * Thread thread1 = new Thread(new SampleRunnable());
		 * 
		 * thread1.setName("testrunnable1"); thread1.start();
		 */
		
		Thread thread = new Thread(()-> {
			
			System.out.println("testthread");
		});
		
		thread.start();
		
		
	}
}