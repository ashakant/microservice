package com.ashakant.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages= {"com.ashakant.serviceprovider"})
@ComponentScan(basePackages= {"com.ashakant.serviceprovider.controller"})
@ComponentScan(basePackages= {"com.ashakant.serviceprovider.domain"})
@ComponentScan(basePackages= {"com.ashakant.serviceprovider.repository"})
@ComponentScan(basePackages= {"com.ashakant.serviceprovider.service"})

public class ServiceProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}
}
