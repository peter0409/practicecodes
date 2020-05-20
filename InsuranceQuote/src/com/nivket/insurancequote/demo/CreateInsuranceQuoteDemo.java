package com.nivket.insurancequote.demo;

import java.util.Scanner;

import com.nivket.insurancequote.controller.QuoteController;
import com.nivket.insurancequote.entity.QuoteInfo;

public class CreateInsuranceQuoteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter your firstName");
    String firstName =input.next();
    System.out.println("Please enter your lastName");
    String lastName =input.next();
    System.out.println("Please enter your driverLicenseNumber");
    String driverLicenseNumber =input.next();
    System.out.println("Please enter your vin");
    String vin =input.next();
    input.close();
    QuoteController controller= new QuoteController();
    QuoteInfo quote=controller.getQuote(firstName,lastName,driverLicenseNumber,vin);
    
    System.out.println("Here is your Quote:");
    System.out.println("Your insurance term: "+String.valueOf(quote.getTerm())+ "month(s)");
    System.out.println("Your insurance price: "+String.valueOf(quote.getAmount()));
    System.out.println("Your insurance number: "+String.valueOf(quote.getQuoteNumber()));





    
    
   
	}

}
