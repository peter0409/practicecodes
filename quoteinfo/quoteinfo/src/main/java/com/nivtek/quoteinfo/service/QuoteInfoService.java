package com.nivtek.quoteinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.quoteinfo.dao.QuoteInfoDao;
import com.nivtek.quoteinfo.entity.Quote;

@Service
public class QuoteInfoService {
	
	@Autowired
	private QuoteInfoDao quoteInfoDao;

	public Quote getQuote(String id) {
		
		
		return quoteInfoDao.fetchQuote(id);
		
		
		
	}
}
