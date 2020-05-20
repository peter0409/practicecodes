package com.nivtek.thread;

public class Consumer implements Runnable {
	
	
	private Data data;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		
		while(true) {
			
			data.get();
		}
	}

	/**
	 * @param data
	 */
	public Consumer() {
		super();
		this.data = data;
	}

}
