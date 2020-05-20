package com.nivtek.autoquest.entity111;

public class OfferToPaymentOption {

	private int offer_id;
	private int option_id;

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

	@Override
	public String toString() {
		return "OfferToPaymentOption [offer_id=" + offer_id + ", option_id=" + option_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + offer_id;
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
		OfferToPaymentOption other = (OfferToPaymentOption) obj;
		if (offer_id != other.offer_id)
			return false;
		if (option_id != other.option_id)
			return false;
		return true;
	}

	/**
	 * @param offer_id
	 * @param option_id
	 */
	public OfferToPaymentOption(int offer_id, int option_id) {
		super();
		this.offer_id = offer_id;
		this.option_id = option_id;
	}

	/**
	 * 
	 */
	public OfferToPaymentOption() {
		super();
	}

}
