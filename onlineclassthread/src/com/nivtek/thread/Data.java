package com.nivtek.thread;

public class Data {
	
	
	
	private int number;
	
	//if flag is false, then its producers turn
	//if flag is true, then its consumers turn
	private boolean flag =false;

	 synchronized  public void put(int number) {
		 
		 if(flag) {
			 
			 
			 try {
				 this.wait();
				 
			 }catch(Exception e) {
				 
				 e.printStackTrace();
			 }
		 }
		 
		 System.out.println(Thread.currentThread().getName()+": " +number);
		this.number = number;
		
		flag =true;
		this.notify();
	}

	
	/**
	 * @param number
	 */
	public Data( ){
	
	}


	synchronized public int get() {
		
		if(!flag) {
			try {
				
				this.wait();
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		 System.out.println(Thread.currentThread().getName()+": " +number);

		 flag = false;
		 
		 this.notify();
		 
		return number;
	}
}
