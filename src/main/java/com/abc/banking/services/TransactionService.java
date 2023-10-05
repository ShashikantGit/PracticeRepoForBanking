package com.cg.banking.services;


import org.springframework.stereotype.Component;

import com.cg.banking.entity.Transaction;
import com.cg.banking.exceptions.TransactionFailedException;
import com.cg.banking.exceptions.TransactionNotFoundException;


public interface TransactionService {
	void addTransaction(Transaction transaction) throws TransactionFailedException;
	Transaction getTransactionDetails(long transId) throws TransactionNotFoundException;

}
