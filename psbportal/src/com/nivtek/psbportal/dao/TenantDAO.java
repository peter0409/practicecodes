package com.nivtek.psbportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nivtek.psbportal.entities.ContactDetails;
import com.nivtek.psbportal.entities.Tenant;

/**
 * @author Oluwafemi Samuel
 *
 */
public class TenantDAO {

	/**
	 * @param propertyName
	 * @return a list containing tenant information
	 */
	public static List<Tenant> getTenantsByPropertyName(String propertyName) {

		List<Tenant> list = new ArrayList<Tenant>();

		try (Connection connection = DAOConnection.getConnection();) {

			PreparedStatement ps = connection.prepareStatement("SELECT tenant_id, tenant_name,"
					+ "tenant_suite_number,contactinfo_name,contactinfo_email,contactinfo_phone "
					+ "from tenant,contactinfo,property where tenant_property_id = property_id  "
					+ "and tenant_contact_id = contactinfo_id and property_name =?");

			ps.setString(1, propertyName);

			ResultSet rs = ps.executeQuery();

			// loop through result table

			while (rs.next()) {

				Tenant tenant = new Tenant();
				ContactDetails contact = new ContactDetails();

				tenant.setTenantId(rs.getInt("tenant_id"));
				tenant.setName(rs.getString("tenant_name"));
				tenant.setSuiteNumber(rs.getInt("tenant_suite_number"));
				contact.setName(rs.getString("contactinfo_name"));
				contact.setEmail(rs.getString("contactinfo_email"));
				contact.setPhone(rs.getString("contactinfo_phone"));

				tenant.setContactinfo(contact);

				list.add(tenant);
			}

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

}
