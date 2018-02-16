package com.ashakant.useraccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashakant.useraccount.service.AccountService;

@Controller
public class DeleteAccountController {

	@Autowired
	private AccountService _accountService;
	
	@RequestMapping(value="/account/{id}",method=RequestMethod.DELETE)
	public ResponseEntity < ? > account(@PathVariable Long id) {
		_accountService.deleteAccount(id) ;
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
