package com.nivtek.psbportal.entities;

/**
 * @author Oluwafemi Samuel
 *
 */

public class Tenant {
	//Instance variables
	
	private int tenantId;
	private String name;
	private int propertyId;
	private int contactId;
	private int suiteNumber;
	private ContactDetails contactinfo;
	

	/**
	 * @return contact info (name, email, etc)
	 */
	public ContactDetails getContactinfo() {
		return contactinfo;
	}
	
	/**
	 * @param contactinfo
	 */
	public void setContactinfo(ContactDetails contactinfo) {
		this.contactinfo = contactinfo;
	}
	
	/**
	 * @return tenantId
	 */
	public int getTenantId() {
		return tenantId;
	}
	
	/**
	 * @param tenantId
	 */
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * @return name
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
	 * @return propertyId
	 */
	public int getPropertyId() {
		return propertyId;
	}
	
	/**
	 * @param propertyId
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	
	
	/**
	 * @return contactId
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
	 * @return suite number
	 */
	public int getSuiteNumber() {
		return suiteNumber;
	}
	
	/**
	 * @param suiteNumber
	 */
	public void setSuiteNumber(int suiteNumber) {
		this.suiteNumber = suiteNumber;
	}

}
