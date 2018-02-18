package com.ashakant.useraccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ashakant.useraccount.domain.UserAccount;
import com.ashakant.useraccount.service.UserAccountService;

public class UserAgentController {
	
	@Autowired
	private UserAccountService _userAccountService;
	
	@RequestMapping(value="/account",method=RequestMethod.POST)
	public ResponseEntity < ? > createUserAgent(@RequestBody UserAccount a_UserAccount) {
		if(_userAccountService.isValid(a_UserAccount)) {
			_userAccountService.createAccount(a_UserAccount) ;
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@RequestMapping(value="/account/{id}",method=RequestMethod.DELETE)
	public ResponseEntity < ? > deleteUserAgent(@PathVariable Long id) {
		_userAccountService.deleteAccount(id) ;
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@RequestMapping(value="/account/{id}",method=RequestMethod.GET)
	public ResponseEntity < ? >  getUserAgent(@PathVariable Long id) {
		UserAccount t_UserAccount=_userAccountService.readAccount(id);
		return new ResponseEntity<>(t_UserAccount, HttpStatus.OK);
	}
	
	@RequestMapping(value="/account",method=RequestMethod.PUT)
	public ResponseEntity < ? > updateUserAgent(@RequestBody UserAccount a_UserAccount) {
		if(_userAccountService.isValid(a_UserAccount)) {
			_userAccountService.createAccount(a_UserAccount) ;
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
	
	
	
	
	@RequestMapping("/")
	public String index() {
		 return "index";
	}
}
