package com.nivtek.quoteinfo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nivtek.quoteinfo.entity.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {

}
