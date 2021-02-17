
package com.nivtek.bankportal.service;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.nivtek.bankportal.entity.Transaction;

@Component

@Primary
public class ProcessorService implements ItemProcessor<Transaction, Transaction> {

	@Override
	public Transaction process(Transaction transaction) throws Exception {

		transaction.setStatus("pending");

		final Transaction transformedTransaction = transaction;

		return transformedTransaction;
	}

}
