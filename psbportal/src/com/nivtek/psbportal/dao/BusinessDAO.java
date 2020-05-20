package com.nivtek.psbportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nivtek.psbportal.entities.Address;
import com.nivtek.psbportal.entities.Business;
import com.nivtek.psbportal.entities.ContactDetails;

/**
 * @author Oluwafemi Samuel
 *
 */
public class BusinessDAO {

	
	/**
	 * @return a list of business address and contact information
	 */
	public static List<Business> getBusinessAddress() {

		List<Business> list = new ArrayList<Business>();

		try(Connection connection = DAOConnection.getConnection();) {

			
			PreparedStatement ps = connection
					.prepareStatement("Select business_name,address_line_one,address_city,address_state,address_zip,"
							+ "contactinfo_phone,contactinfo_email from business,contactinfo,address where address_id=business_address_id "
							+ "AND contactinfo_id = business_contact_id");

			ResultSet rs = ps.executeQuery();

			//loop through result table
			while (rs.next()) {

				Business business = new Business();
				Address address = new Address();
				ContactDetails contact = new ContactDetails();

				business.setBusinessName(rs.getString("business_name"));
				address.setAddressLineOne(rs.getString("address_line_one"));
				address.setCity(rs.getString("address_city"));
				address.setState(rs.getString("address_state"));
				address.setZipCode(rs.getInt("address_zip"));
				business.setBusinessAddress(address);
				contact.setPhone(rs.getString("contactinfo_phone"));
				contact.setEmail(rs.getString("contactinfo_email"));
				business.setBusinessContact(contact);

				list.add(business);
			}


		} catch (Exception e) {

			e.printStackTrace();
		}
		return list;

	}

}
