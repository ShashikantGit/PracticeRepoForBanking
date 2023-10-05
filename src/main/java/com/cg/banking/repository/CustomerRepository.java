package com.cg.banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.banking.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	/*
	 * Customer save(Customer customer); Customer update(Customer account); boolean
	 * delete(long customerId);
	 */
	Optional<Customer> findByCustomerId(long customerId); 
}
