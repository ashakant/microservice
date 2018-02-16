package com.ashakant.useraccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashakant.useraccount.domain.UserAccount;
import com.ashakant.useraccount.service.AccountService;

@Controller
public class ReadAccountController {

	@Autowired
	private AccountService _accountService;
	
	/**
	 *  @RequestMapping(value = "/head", headers = {"content-type=text/plain"})
	 *  @RequestMapping(value = "/ex/foos", headers = { "key1=val1", "key2=val2" }, method = GET)
	 */
	@RequestMapping(value="/account/{id}",method=RequestMethod.GET)
	public ResponseEntity < ? >  account(@PathVariable Long id) {
		UserAccount t_UserAccount=_accountService.readAccount(id);
		return new ResponseEntity<>(t_UserAccount, HttpStatus.OK);
	}
}
