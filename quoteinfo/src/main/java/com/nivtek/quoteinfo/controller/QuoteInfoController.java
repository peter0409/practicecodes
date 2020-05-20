package com.nivtek.quoteinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nivtek.quoteinfo.dao.QuoteRepository;
import com.nivtek.quoteinfo.entity.Quote;
import com.nivtek.quoteinfo.service.QuoteInfoService;

@RestController
@RequestMapping("api/v1")
public class QuoteInfoController {

	@Autowired
	private QuoteRepository quoteRepository;

	@Autowired
	private QuoteInfoService quoteInfoService;

	@GetMapping("quote/{id}")
	public Quote fetchQuote(@PathVariable("id") String id) {

		return quoteInfoService.getQuote(id);

	}

	@GetMapping("quotes")
	public List<Quote> fetchAllQuote() {

		return quoteRepository.findAll();

	}
	
	@PostMapping("quotes")
	public Quote addAllQuote(@RequestBody Quote quote) {

		return quoteRepository.save(quote);

	}
}