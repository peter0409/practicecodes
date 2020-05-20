package com.nivtek.quote.nameandaddress.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NameAddressExceptionHandler {

	@ExceptionHandler(value = NameAddressNotFoundException.class)
	public ResponseEntity<Object> exception(NameAddressNotFoundException exception){
		
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
		
		
	}
}

//400 -Client's fault'
//500 -Server fault
//200 -Successful
//300 -nothing changed maybe it gets 200 at first and will get 300 second time. Cache