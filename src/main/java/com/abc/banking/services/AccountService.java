package com.cg.banking.services;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.cg.banking.entity.Account;
import com.cg.banking.exceptions.AccountDetailsNotFoundException;
import com.cg.banking.exceptions.CustomerDetailsNotFoundException;
import com.cg.banking.exceptions.InsufficientBalanceException;
import com.cg.banking.exceptions.TransactionFailedException;



public interface AccountService {

	Account addAccount(Account account,Long customerId) throws CustomerDetailsNotFoundException;
	boolean deleteAccount(int accountNumber) throws AccountDetailsNotFoundException;
	boolean updateAccount(Account account) throws AccountDetailsNotFoundException;
	Account getAccountDetails(long acctId) throws AccountDetailsNotFoundException;
	List<Account> getAllAccountDetails();
	double withdraw(long accountNumber, double amount) throws InsufficientBalanceException, AccountDetailsNotFoundException, TransactionFailedException;
	double deposit(long accountNumber, double amount) throws AccountDetailsNotFoundException, TransactionFailedException;
	double getAccountBalance(long accountNumber) throws AccountDetailsNotFoundException;
	boolean fundTransfer(long accountNumberFrom, long accountNumberTo, double amount) throws InsufficientBalanceException, AccountDetailsNotFoundException;

}
