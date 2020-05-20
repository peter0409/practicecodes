package com.nivtek.quote.nameandaddress.exception;

public class NameAddressNotFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		
		
		return "Name Address Not Found";
	}
}
