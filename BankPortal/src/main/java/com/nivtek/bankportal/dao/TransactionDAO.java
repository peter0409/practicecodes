package com.nivtek.bankportal.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDAO {

	
	@Autowired
	private DataSource dataSource;

	public void processTransactions() {

		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("update_status");

		jdbcCall.execute(new MapSqlParameterSource());
	}
	
}
