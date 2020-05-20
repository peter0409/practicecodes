package com.nivtek.corejava.operators.lab1;

public class Investment {

	private static float getFirstYearMoney(int money, float rate) {

		float investmentFirstYear = money * (1 + rate);

		return investmentFirstYear;
	}

	private static float getSecondYearMoney(float investmentFirstYear, int number) {
		float investmentSecondYear = investmentFirstYear - number;
		return investmentSecondYear;

	}

	private static float getThirdYearMoney(float investSecondYear, float rate1) {
		float investThirdYear = investSecondYear * (1 + rate1);
		return investThirdYear;
	}

	public static void main(String[] args) {
		int investment = 14000;
		float investmentFirstYear = getFirstYearMoney(14000, 0.4f);
		float investSecondYear = getSecondYearMoney(investmentFirstYear, 1500);
		float investThirdYear = getThirdYearMoney(investSecondYear, 0.12f);
         System.out.println("Initialization money " + investment+ "\nfirstyear " + investmentFirstYear + "\nsecondyear " + investSecondYear +"\nthirdyear "+investThirdYear);
	}

}
