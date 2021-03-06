package com.ashakant.useraccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EntityScan( basePackages = {"com.ashakant.useraccount.domain"} )
@ComponentScan(basePackages= {"com.ashakant.useraccount"})
@ComponentScan(basePackages= {"com.ashakant.useraccount.controller"})
@ComponentScan(basePackages= {"com.ashakant.useraccount.domain"})
@ComponentScan(basePackages= {"com.ashakant.useraccount.repository"})
@ComponentScan(basePackages= {"com.ashakant.useraccount.service"})

public class AccountServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
}



