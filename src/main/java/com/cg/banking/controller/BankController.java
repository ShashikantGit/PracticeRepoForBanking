package com.cg.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.banking.entity.Account;
import com.cg.banking.entity.Customer;
import com.cg.banking.entity.Transaction;
import com.cg.banking.exceptions.AccountDetailsNotFoundException;
import com.cg.banking.exceptions.CustomerAlreadyExistsException;
import com.cg.banking.exceptions.CustomerDetailsNotFoundException;
import com.cg.banking.exceptions.TransactionFailedException;
import com.cg.banking.exceptions.TransactionNotFoundException;
import com.cg.banking.services.AccountService;
import com.cg.banking.services.CustomerService;
import com.cg.banking.services.TransactionService;

@RestController
public class BankController {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private AccountService acctService;
	@Autowired
	private TransactionService transService;

	// Add new Customer
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
			throws CustomerAlreadyExistsException {
		customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	// Get the Customer Details
	@GetMapping("/customers/{custId}")
	public ResponseEntity<Customer> getCustomerInfo(@PathVariable Long custID) throws CustomerDetailsNotFoundException {

		Customer customer = customerService.getCustomerDetails(custID);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);

	}
	// Update Customer details

	@PutMapping("/updateCustomer/{custId}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer)
			throws CustomerDetailsNotFoundException {

		customerService.updateCustomer(customer);

		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	// Delete Mapping

	@DeleteMapping("/deleteCustomer/{custId}")
	public ResponseEntity<Customer> deleteCustomer1(@PathVariable Long custId) throws CustomerDetailsNotFoundException {

		customerService.deleteCustomer(custId);

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@PostMapping("/addAccount")

	public ResponseEntity<Account> createAccount(@RequestBody Account account) throws CustomerDetailsNotFoundException {

		acctService.addAccount(account);

		return new ResponseEntity<Account>(account, HttpStatus.OK);

		// accountController.createAccount(customer.getAcctID(), 0, "Active");

	}

	@GetMapping("/getAccount/{accId}")

	public ResponseEntity<Account> getAccountInfo(@PathVariable Long acctId)
			throws CustomerDetailsNotFoundException, AccountDetailsNotFoundException {

		Account account = acctService.getAccountDetails(acctId);

		return new ResponseEntity<Account>(account, HttpStatus.OK);

	}

	@DeleteMapping("/deleteAccount/{acctId}")

	public ResponseEntity<Account> deleteCustomer(@PathVariable Long acctId)

			throws CustomerDetailsNotFoundException {

		// boolean acctDelStatus = acctService.deleteAccount(acctId);

		return new ResponseEntity<Account>(HttpStatus.OK);

	}

	@PutMapping("/account/{accId}")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account)

			throws CustomerAlreadyExistsException, CustomerDetailsNotFoundException, AccountDetailsNotFoundException {

		acctService.updateAccount(account);

		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

	@PostMapping("/addTransaction")

	public ResponseEntity<Transaction> createCustomer(@RequestBody Transaction transaction)

			throws CustomerAlreadyExistsException, TransactionFailedException {

		transService.addTransaction(transaction);

		return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);

		// accountController.createAccount(customer.getAcctID(), 0, "Active");

	}

	@GetMapping("/getTransaction/{transId}")

	public ResponseEntity<Transaction> getTransactionInfo(@PathVariable Long transId)

			throws CustomerDetailsNotFoundException, AccountDetailsNotFoundException, TransactionNotFoundException {

		Transaction trans = transService.getTransactionDetails(transId);

		return new ResponseEntity<Transaction>(trans, HttpStatus.OK);

	}
}
