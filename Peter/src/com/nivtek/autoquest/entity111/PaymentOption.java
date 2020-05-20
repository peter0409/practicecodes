package com.nivtek.autoquest.entity111;

public class PaymentOption {
	private int option_id;
	private double monthlyInterest;
	private int months;

	/**
	 * @return the option_id
	 */
	public int getOption_id() {
		return option_id;
	}

	/**
	 * @param option_id the option_id to set
	 */
	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}

	/**
	 * @return the monthlyInterest
	 */
	public double getMonthlyInterest() {
		return monthlyInterest;
	}

	/**
	 * @param monthlyInterest the monthlyInterest to set
	 */
	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}

	/**
	 * @return the months
	 */
	public int getMonths() {
		return months;
	}

	/**
	 * @param months the months to set
	 */
	public void setMonths(int months) {
		this.months = months;
	}

	@Override
	public String toString() {
		return "PaymentOption [option_id=" + option_id + ", monthlyInterest=" + monthlyInterest + ", months=" + months
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(monthlyInterest);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + months;
		result = prime * result + option_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentOption other = (PaymentOption) obj;
		if (Double.doubleToLongBits(monthlyInterest) != Double.doubleToLongBits(other.monthlyInterest))
			return false;
		if (months != other.months)
			return false;
		if (option_id != other.option_id)
			return false;
		return true;
	}

	/**
	 * @param option_id
	 * @param monthlyInterest
	 * @param months
	 */
	public PaymentOption(int option_id, double monthlyInterest, int months) {
		super();
		this.option_id = option_id;
		this.monthlyInterest = monthlyInterest;
		this.months = months;
	}

	/**
	 * 
	 */
	public PaymentOption() {
		super();
	}

}
