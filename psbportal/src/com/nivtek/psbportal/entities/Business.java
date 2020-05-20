package com.nivtek.psbportal.entities;

/**
 * @author Oluwafemi Samuel
 *
 */
public class Business {
	
//Instance variables
	private int businessId;
	private String businessName;
	private ContactDetails businessContact;
	private Address BusinessAddress;
	

	//Setters and getters 
	
	public int getBusinessId() {
		return businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public ContactDetails getBusinessContact() {
		return businessContact;
	}

	public void setBusinessContact(ContactDetails businessContact) {
		this.businessContact = businessContact;
	}

	public Address getBusinessAddress() {
		return BusinessAddress;
	}

	public void setBusinessAddress(Address businessAddress) {
		BusinessAddress = businessAddress;
	}
}
