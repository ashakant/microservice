package com.ashakant.useraccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages= {"com.dhiyo.account.AccountServiceApplication"})
@ComponentScan(basePackages= {"com.dhiyo.account.controller"})
@ComponentScan(basePackages= {"com.dhiyo.account.domain"})
@ComponentScan(basePackages= {"com.dhiyo.account.repository"})
@ComponentScan(basePackages= {"com.dhiyo.account.service"})

public class AccountServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
}

