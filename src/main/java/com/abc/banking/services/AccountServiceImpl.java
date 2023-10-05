package com.cg.banking.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cg.banking.entity.Account;
import com.cg.banking.exceptions.AccountDetailsNotFoundException;
import com.cg.banking.exceptions.CustomerDetailsNotFoundException;
import com.cg.banking.exceptions.InsufficientBalanceException;
import com.cg.banking.exceptions.TransactionFailedException;

public class AccountServiceImpl implements AccountService{

	@Override
	@Transactional
	public Account addAccount(Account account, Long customerId) throws CustomerDetailsNotFoundException {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.setId(customerId);
		account.setCustomer(customer);
		return accountRepository.save(account);
	}

	@Override
	public boolean deleteAccount(int accountNumber) throws AccountDetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAccount(Account account) throws AccountDetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountDetails(long acctId) throws AccountDetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double withdraw(long accountNumber, double amount)
			throws InsufficientBalanceException, AccountDetailsNotFoundException, TransactionFailedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposit(long accountNumber, double amount)
			throws AccountDetailsNotFoundException, TransactionFailedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAccountBalance(long accountNumber) throws AccountDetailsNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(long accountNumberFrom, long accountNumberTo, double amount)
			throws InsufficientBalanceException, AccountDetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
