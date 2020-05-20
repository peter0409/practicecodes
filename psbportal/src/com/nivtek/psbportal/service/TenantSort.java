package com.nivtek.psbportal.service;

import java.util.Comparator;

import com.nivtek.psbportal.entities.Tenant;

public class TenantSort implements Comparator<Tenant> {

	@Override
	public int compare(Tenant tenant1, Tenant tenant2 ) {
		
		//SORT BY NAME
		return tenant1.getName().compareTo(tenant2.getName());
	}

}
