package com.nivtek.autoquest.entity111;

public class LoanOffer {

	private int offer_id;
	private boolean approved;
	private double amount;
	private String approvedTime;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (approved ? 1231 : 1237);
		result = prime * result + ((approvedTime == null) ? 0 : approvedTime.hashCode());
		result = prime * result + offer_id;
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
		LoanOffer other = (LoanOffer) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (approved != other.approved)
			return false;
		if (approvedTime == null) {
			if (other.approvedTime != null)
				return false;
		} else if (!approvedTime.equals(other.approvedTime))
			return false;
		if (offer_id != other.offer_id)
			return false;
		return true;
	}

	/**
	 * @return the offer_id
	 */
	public int getOffer_id() {
		return offer_id;
	}

	/**
	 * @param offer_id the offer_id to set
	 */
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}

	/**
	 * @return the approved
	 */
	public boolean isApproved() {
		return approved;
	}

	/**
	 * @param approved the approved to set
	 */
	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the approvedTime
	 */
	public String getApprovedTime() {
		return approvedTime;
	}

	/**
	 * @param approvedTime the approvedTime to set
	 */
	public void setApprovedTime(String approvedTime) {
		this.approvedTime = approvedTime;
	}

	@Override
	public String toString() {
		return "LoanOffer [offer_id=" + offer_id + ", approved=" + approved + ", amount=" + amount + ", approvedTime="
				+ approvedTime + "]";
	}

	/**
	 * @param offer_id
	 * @param approved
	 * @param amount
	 * @param approvedTime
	 */
	public LoanOffer(int offer_id, boolean approved, double amount, String approvedTime) {
		super();
		this.offer_id = offer_id;
		this.approved = approved;
		this.amount = amount;
		this.approvedTime = approvedTime;
	}

	/**
	 * 
	 */
	public LoanOffer() {
		super();
	}

}
