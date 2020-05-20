package com.nivtek.thread;

public class TestProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Data data = new Data();

Producer producer = new Producer(data);

Consumer consumer = new Consumer();

Thread produceThread = new Thread (producer,"producer");

Thread consumerThread = new Thread(consumer,"consumer");

produceThread.start();

consumerThread.start();
		
		
		
		
	}

}
