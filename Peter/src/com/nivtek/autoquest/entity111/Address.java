package com.nivtek.autoquest.entity111;

public class Address {

	private int Address_id;
	private String FirstLine;
	private String SecondLine;
	private String city;
	private String state;
	private String zip;
	private String time;
	private String ifRent;
	private double expense;

	/**
	 * 
	 */
	public Address() {
		super();
	}

	/**
	 * @param address_id
	 * @param firstLine
	 * @param secondLine
	 * @param city
	 * @param state
	 * @param zip
	 * @param time
	 * @param ifRent
	 * @param expense
	 */
	public Address(int address_id, String firstLine, String secondLine, String city, String state, String zip,
			String time, String ifRent, double expense) {
		super();
		Address_id = address_id;
		FirstLine = firstLine;
		SecondLine = secondLine;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.time = time;
		this.ifRent = ifRent;
		this.expense = expense;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Address_id;
		result = prime * result + ((FirstLine == null) ? 0 : FirstLine.hashCode());
		result = prime * result + ((SecondLine == null) ? 0 : SecondLine.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		long temp;
		temp = Double.doubleToLongBits(expense);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ifRent == null) ? 0 : ifRent.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		Address other = (Address) obj;
		if (Address_id != other.Address_id)
			return false;
		if (FirstLine == null) {
			if (other.FirstLine != null)
				return false;
		} else if (!FirstLine.equals(other.FirstLine))
			return false;
		if (SecondLine == null) {
			if (other.SecondLine != null)
				return false;
		} else if (!SecondLine.equals(other.SecondLine))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (Double.doubleToLongBits(expense) != Double.doubleToLongBits(other.expense))
			return false;
		if (ifRent == null) {
			if (other.ifRent != null)
				return false;
		} else if (!ifRent.equals(other.ifRent))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [Address_id=" + Address_id + ", FirstLine=" + FirstLine + ", SecondLine=" + SecondLine
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", time=" + time + ", ifRent=" + ifRent
				+ ", expense=" + expense + "]";
	}

	/**
	 * @return the address_id
	 */
	public int getAddress_id() {
		return Address_id;
	}

	/**
	 * @param address_id the address_id to set
	 */
	public void setAddress_id(int address_id) {
		Address_id = address_id;
	}

	/**
	 * @return the firstLine
	 */
	public String getFirstLine() {
		return FirstLine;
	}

	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(String firstLine) {
		FirstLine = firstLine;
	}

	/**
	 * @return the secondLine
	 */
	public String getSecondLine() {
		return SecondLine;
	}

	/**
	 * @param secondLine the secondLine to set
	 */
	public void setSecondLine(String secondLine) {
		SecondLine = secondLine;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the ifRent
	 */
	public String getIfRent() {
		return ifRent;
	}

	/**
	 * @param ifRent the ifRent to set
	 */
	public void setIfRent(String ifRent) {
		this.ifRent = ifRent;
	}

	/**
	 * @return the expense
	 */
	public double getExpense() {
		return expense;
	}

	/**
	 * @param expense the expense to set
	 */
	public void setExpense(double expense) {
		this.expense = expense;
	}

}
