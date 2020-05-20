package com.nivket.autoloan.entity;

/**
 * @author Bootcamp User 007
 *
 */
public class Bank {
	private int term ;
	private int amount;
	private int quoteNumber;
	private static double apr=9;
//getter and setter
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(int quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public static double getApr() {
		return apr;
	}
	public static void setApr(double apr) {
		Bank.apr = apr;
	}

	

}


