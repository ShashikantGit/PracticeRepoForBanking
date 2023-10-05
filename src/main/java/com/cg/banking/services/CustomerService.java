package com.cg.banking.services;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.stereotype.Component;

import com.cg.banking.entity.Account;
import com.cg.banking.entity.Customer;
import com.cg.banking.exceptions.CustomerAlreadyExistsException;
import com.cg.banking.exceptions.CustomerDetailsNotFoundException;


public interface CustomerService {
	//Customer addCustomer(long customerId, String name, List<Account> accounts, String address, long phoneNo, String emailId) throws CustomerAlreadyExistsException;
	Customer addCustomer(Customer customer);
	boolean deleteCustomer(long customerId) throws CustomerDetailsNotFoundException;
	boolean updateCustomer(Customer customer) throws CustomerDetailsNotFoundException;
	Customer getCustomerDetails(Long id) throws CustomerDetailsNotFoundException;
	
}
