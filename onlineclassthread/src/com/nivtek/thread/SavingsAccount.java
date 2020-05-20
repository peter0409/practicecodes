package com.nivtek.thread;

public class SavingsAccount {

	int accountNo;
	float balance;

	/**
	 * @param accountNo
	 * @param balance
	 */
	public SavingsAccount(int accountNo, float balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNo=" + accountNo + ", balance=" + balance + "]";
	}

	/**
	 * 
	 */
	public SavingsAccount() {
	}

	
	//class lock
	synchronized public static void sampleStatic() {
		
		
		synchronized(SavingsAccount.class) {
			
			
		}
		
	}
	  public void withdraw(int amount) {
		
		//synchronized block
		synchronized(this) {

		if (amount <= balance) {
			System.out.println(Thread.currentThread().getName() + " is about tp withdraw");
//			balance = balance - amount;

			try {

				Thread.sleep(500);
			} catch (Exception e) {

				e.printStackTrace();

			}
			balance = balance - amount;

		} else {
			System.out.println("there not enough balance for the " + Thread.currentThread().getName() + " to withdraw");
//			System.err.println("invalid withdraw amount");

		}
		}
		System.out.println(Thread.currentThread().getName() + " is done withdrawing");
	}

	
	public void deposit(int amount) {
		
		if(amount>0) {
			
			balance = balance +amount;
			
		}else {
			
			System.err.println("invalid deposit amount");
		}
		
		
	}
	
	
	
}
