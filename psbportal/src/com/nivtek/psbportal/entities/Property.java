package com.nivtek.psbportal.entities;

/**
 * @author Oluwafemi Samuel
 *
 */

public class Property {
	//Instance variables
	
	private int propertyId;
	private String name;
	private int contactId;
	private int businessId;

//getters and setters
	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getBusinessId() {
		return businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
}
