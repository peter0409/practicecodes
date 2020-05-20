package com.nivket.autoinsurance.cotroller;

import com.nivket.autoinsurance.entity.Request;
import com.nivket.autoinsurance.service.QuoteService;

/**
 * @author Bootcamp User 007
 *
 */
public class QuoteController {

	public void getQuote(Request request) {
//create object of QuoteService class and pass request to QuoteService class
		QuoteService quoteService = new QuoteService();
		quoteService.getQuote(request);

	}

}
