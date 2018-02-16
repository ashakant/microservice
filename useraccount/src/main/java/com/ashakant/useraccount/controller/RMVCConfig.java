package com.ashakant.useraccount.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class RMVCConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home"); //home is refer to home.html file
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/login").setViewName("login"); //login is refer to login.html file
	}
}
