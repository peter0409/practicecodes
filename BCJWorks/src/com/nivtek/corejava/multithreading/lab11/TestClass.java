package com.nivtek.corejava.multithreading.lab11;

public class TestClass implements Runnable {

	int x = 5; 
	  public void run() 
	  { 
	    this.x = 10; 
	  } 
	  public static void main(String[] args) throws InterruptedException 
	  { 
	     TestClass tc = new TestClass(); 
	     Thread t = new Thread(tc);
	     t.start();// 1 
	     t.join();
	     System.out.println(tc.x); 
	  } 

}
