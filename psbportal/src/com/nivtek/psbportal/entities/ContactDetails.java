package com.nivtek.psbportal.entities;

public class ContactDetails {
	// Instance variables

	private int contactId;
	private String name;
	private String email;
	private String phone;

	// Getters and setters

	/**
	 * @return
	 */
	public int getContactId() {
		return contactId;
	}

	/**
	 * @param contactId
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
