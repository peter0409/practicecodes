/**
 * 
 */
package com.nivtek.thread;

/**
 * @author Bootcamp User 007
 *
 */
public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount(101, 5000);

		Thread thread = new Thread(new AccountTransaction(account));

		thread.setName("Transation-1");
		thread.start();

		Thread thread2 = new Thread(new AccountTransaction(account));

		thread2.setName("Transation-2");
		thread2.start();

	}

}
