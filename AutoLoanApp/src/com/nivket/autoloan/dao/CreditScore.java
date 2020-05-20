package com.nivket.autoloan.dao;

import com.nivket.autoloan.entity.Request;

public class CreditScore {
	public int getCreditScore(int ssn) {

		Request request = new Request();
		request.getSsn();
		int creditScore = Integer.parseInt((Integer.toString(ssn).substring(0, 3)));

		return creditScore;
	}

}
