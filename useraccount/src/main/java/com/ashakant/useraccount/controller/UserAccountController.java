package com.ashakant.useraccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ashakant.useraccount.domain.UserAccount;
import com.ashakant.useraccount.service.UserAccountService;

@Controller
public class UserAccountController {
	
	@Autowired
	private UserAccountService _userAccountService;
	
	/**
	 * Create New Account
	 * @param a_UserAccount
	 * @return
	 */
	@RequestMapping(value="/account",method=RequestMethod.POST)
	public ResponseEntity < ? > createUserAccount(@RequestBody UserAccount a_UserAccount) {
		if(_userAccountService.isValid(a_UserAccount)) {
			_userAccountService.createAccount(a_UserAccount) ;
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	/**
	 * Read existing account
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/account/{id}",method=RequestMethod.GET)
	public ResponseEntity < ? >  getUserAccount(@PathVariable String id) {
		UserAccount t_UserAccount=_userAccountService.readUserAccount(id);
		return new ResponseEntity<>(t_UserAccount, HttpStatus.OK);
	}
	
	/**
	 * Update existing account 
	 * @param a_UserAccount
	 * @return
	 */
	@RequestMapping(value="/account",method=RequestMethod.PUT)
	public ResponseEntity < ? > updateUserAccount(@RequestBody UserAccount a_UserAccount) {
		if(_userAccountService.isValid(a_UserAccount)) {
			_userAccountService.createAccount(a_UserAccount) ;
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	/**
	 * Delete existing account
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/account/{id}",method=RequestMethod.DELETE)
	public ResponseEntity < ? > deleteUserAccount(@PathVariable String id) {
		_userAccountService.deleteUserAccount(id) ;
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@RequestMapping("/")
	public String index() {
		 return "index";
	}
}
