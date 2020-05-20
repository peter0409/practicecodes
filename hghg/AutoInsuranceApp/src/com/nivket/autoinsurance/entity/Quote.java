package com.nivket.autoinsurance.entity;

/**
 * @author Bootcamp User 007
 *
 */
public class Quote {

	private int amount;
	private int quoteNumber;
	private static final int term = 6;

//setter and getter
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

	public static int getTerm() {
		return term;
	}

}
