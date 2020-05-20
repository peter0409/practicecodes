package com.nivtek.corejava.multithreading.lab13;

public class MyRunnable implements Runnable {

	MyRunnable(String name)
	{
		new Thread(this, name).start();
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

}
