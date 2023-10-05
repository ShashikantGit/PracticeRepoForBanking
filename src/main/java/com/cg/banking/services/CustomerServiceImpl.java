package com.cg.banking.services;

import com.cg.banking.entity.Customer;
import com.cg.banking.exceptions.CustomerDetailsNotFoundException;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(long customerId) throws CustomerDetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws CustomerDetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomerDetails(Long id) throws CustomerDetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
