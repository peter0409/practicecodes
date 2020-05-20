package com.nivtek.thread;

public class Producer implements Runnable {

	private Data data;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;

		while (true)

			data.put(++i);
	}

	/**
	 * @param data
	 */
	public Producer(Data data) {
		super();
		this.data = data;
	}

}
