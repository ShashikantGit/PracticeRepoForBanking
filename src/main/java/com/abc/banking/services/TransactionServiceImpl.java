package com.cg.banking.services;

import com.cg.banking.entity.Transaction;
import com.cg.banking.exceptions.TransactionFailedException;
import com.cg.banking.exceptions.TransactionNotFoundException;

public class TransactionServiceImpl implements TransactionService{

	@Override
	public void addTransaction(Transaction transaction) throws TransactionFailedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction getTransactionDetails(long transId) throws TransactionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
