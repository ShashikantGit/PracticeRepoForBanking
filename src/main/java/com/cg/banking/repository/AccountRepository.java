package com.cg.banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.banking.entity.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	/*
	 * Account save(Account account); Account update(Account account); boolean
	 * delete(long number);
	 */
	Optional<Account> findByAccountId(long number); 
}
