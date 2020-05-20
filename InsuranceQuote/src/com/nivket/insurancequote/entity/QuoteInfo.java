package com.nivket.insurancequote.entity;

public class QuoteInfo {
	private int amount;
	private double quoteNumber;
	private int term;
	

	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public double getQuoteNumber() {
		return quoteNumber;
	}


	public void setQuoteNumber(double quoteNumber) {
		this.quoteNumber = quoteNumber;
	}


	public int getTerm() {
		return term;
	}


	public void setTerm(int term) {
		this.term = term;
	}


	public QuoteInfo(int amount, double quoteNumber, int term) {
		super();
		this.amount = amount;
		this.quoteNumber = quoteNumber;
		this.term = term;
	}
}
