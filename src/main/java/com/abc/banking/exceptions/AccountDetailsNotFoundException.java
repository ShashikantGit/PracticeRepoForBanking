package com.cg.banking.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccountDetailsNotFoundException extends Exception{

	
	public AccountDetailsNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AccountDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AccountDetailsNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		 
	}

	public AccountDetailsNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
