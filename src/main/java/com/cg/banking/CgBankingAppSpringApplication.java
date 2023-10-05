package com.cg.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages="com.cg.banking.*")
public class CgBankingAppSpringApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CgBankingAppSpringApplication.class, args);
	}
	
}
