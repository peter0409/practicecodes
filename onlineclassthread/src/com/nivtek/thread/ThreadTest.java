package com.nivtek.thread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Thread thread = Thread.currentThread();
		 * 
		 * System.out.println(thread.getName());
		 * 
		 * Thread.sleep(3000);
		 * 
		 * System.out.println("end of main()");
		 * 
		 */

		SampleThread tt = new SampleThread();

		tt.setName("samplethread");

		tt.start();

		SampleThread tt1 = new SampleThread();
		tt1.setName("samplethread2");
		tt1.start();
	}
}
