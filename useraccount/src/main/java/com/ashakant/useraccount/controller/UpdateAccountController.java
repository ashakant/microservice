package com.ashakant.useraccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashakant.useraccount.domain.UserAccount;
import com.ashakant.useraccount.service.AccountService;

@Controller
public class UpdateAccountController {

	@Autowired
	private AccountService _accountService;
	
	@RequestMapping(value="/account",method=RequestMethod.PUT)
	public ResponseEntity < ? > account(@RequestBody UserAccount a_UserAccount) {
		if(_accountService.isValid(a_UserAccount)) {
			_accountService.createAccount(a_UserAccount) ;
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
