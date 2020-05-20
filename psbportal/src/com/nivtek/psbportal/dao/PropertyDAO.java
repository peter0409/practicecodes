package com.nivtek.psbportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nivtek.psbportal.entities.Property;
import com.nivtek.psbportal.entities.Tenant;
import com.nivtek.psbportal.service.TenantSort;

public class PropertyDAO {


	 List<String> allProperties = new ArrayList<String>();
	 Map<String, List<Tenant>> propertyTenantMap = new HashMap<String, List<Tenant>>();
	 

	public  Map<String, List<Tenant>> getAllTenantsGroupByProperty() {

		try(Connection connection = DAOConnection.getConnection();) {

			
			PreparedStatement ps = connection.prepareStatement("SELECT property_name FROM property;");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Property property = new Property();
				property.setName(rs.getString("property_name"));
				allProperties.add(property.getName());
			}
			
			for(String uniqueProperty : allProperties) {
				
				List<Tenant> tenants = TenantDAO.getTenantsByPropertyName(uniqueProperty);
				TenantSort sortTenants = new TenantSort();
				Collections.sort(tenants, sortTenants);
				propertyTenantMap.put(uniqueProperty, tenants);
			}

				
		} catch (Exception e) {

			e.printStackTrace();

		}
		return propertyTenantMap;

	}

}
