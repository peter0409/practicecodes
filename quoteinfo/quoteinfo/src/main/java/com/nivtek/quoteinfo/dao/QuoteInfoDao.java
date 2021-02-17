package com.nivtek.quoteinfo.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nivtek.quoteinfo.entity.Customer;
import com.nivtek.quoteinfo.entity.Quote;

@Component
public class QuoteInfoDao {

	public Quote fetchQuote(String id) {

		Quote qt = new Quote();

		Customer customer = new Customer();

		customer.setFirstName("peter");
		customer.setLastName("zhao");

		qt.setAmount(1000);
		qt.setDate(Calendar.getInstance().getTime());
		qt.setId(1);
		qt.setQuoteNumber(11);
		qt.setTerm(5);
		qt.setCustomer(customer);

		return qt;

	}

	public List<Quote> fetchAllQuote(String id) {

		List<Quote> quotes = new ArrayList<>();

		Quote qt = new Quote();

		Customer customer = new Customer();

		customer.setFirstName("aaa");
		customer.setLastName("zhao");

		qt.setAmount(2000);
		qt.setDate(Calendar.getInstance().getTime());
		qt.setId(3);
		qt.setQuoteNumber(12);
		qt.setTerm(5);
		qt.setCustomer(customer);

		Quote qt1 = new Quote();

		Customer customer1 = new Customer();

		customer.setFirstName("bbb");
		customer.setLastName("zhao");

		qt.setAmount(3000);
		qt.setDate(Calendar.getInstance().getTime());
		qt.setId(2);
		qt.setQuoteNumber(15);
		qt.setTerm(4);
		qt.setCustomer(customer1);

		quotes.add(qt);
		quotes.add(qt1);

		return quotes;

	}

}
