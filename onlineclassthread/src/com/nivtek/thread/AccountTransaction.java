package com.nivtek.thread;


	public class AccountTransaction implements Runnable {
		private SavingsAccount account;
		/**
		 * @param account
		 */
		public AccountTransaction(SavingsAccount account) {
			this.account = account;
		}
		/**
		 * prints account details only
		 */
		@Override
		public void run() {
			
			
			for(int i=0; i<5; i++) {

				account.withdraw(1000);

				if(account.balance<0) {
					
				System.err.println("account is overdrawn!");}
				}
				
				
//			System.out.println(account);
//			account.withdraw(1000);
		}
	}
	
	
	
