package com.nivket.insurancequote.controller;

import com.nivket.insurancequote.entity.QuoteInfo;
import com.nivket.insurancequote.entity.RequestInfo;
import com.nivket.insurancequote.service.QuoteService;

public class QuoteController {

public QuoteInfo getQuote(String firstName,String lastName,String driverLicenseNumber,String vin) {
	
	RequestInfo request= new RequestInfo();
	request.setFirstName(firstName);
	request.setLastName(lastName);
	request.setDriverLicenseNumber(driverLicenseNumber);
	request.setVin(vin);
	
	
	QuoteService service= new QuoteService();
	return service.getQuote(request);
	

}
	
	
	

	}


