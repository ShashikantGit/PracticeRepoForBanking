package com.cg.banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.banking.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	/*
	 * Transaction save(Transaction transaction); Transaction update(Transaction
	 * transaction); boolean delete(long transid);
	 */
	Optional<Transaction> findByTransactionId(long transid); 
}
