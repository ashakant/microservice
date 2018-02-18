package com.ashakant.useraccount.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ashakant.useraccount.domain.UserAgents;
import com.ashakant.useraccount.service.UserAgentsService;

@Controller
public class UserAgentController {
	
	@Autowired
	private UserAgentsService _userAgentsService;
	
	/**
	 * Create new UserAgent
	 * @param a_UserAgents
	 * @return
	 */
	@RequestMapping(value="/account/useragent{accountId}",method=RequestMethod.POST)
	public ResponseEntity < ? > createUserAgent(@RequestBody UserAgents a_UserAgents) {
		if(_userAgentsService.isValid(a_UserAgents)) {
			_userAgentsService.createUserAgent(a_UserAgents) ;
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	/**
	 * Read user agents by account id
	 * One->To-Many relation reflect in url : one account -many user agents -specific id
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/account/useragents/{accountId}",method=RequestMethod.GET)
	public ResponseEntity < ? >  getUserAgentByAccountId(@PathVariable String accountId) {
		List<UserAgents> t_UserAgents=_userAgentsService.getUserAgentById(accountId);
		return new ResponseEntity<>(t_UserAgents, HttpStatus.OK);
	}
	
	
	
	/**
	 * Update  UserAgent by account id 
	 * @param a_UserAgents
	 * @return
	 */
	@RequestMapping(value="/account/useragents/{accountId}",method=RequestMethod.PUT)
	public ResponseEntity < ? > updateUserAgent(@RequestBody UserAgents a_UserAgents) {
		if(_userAgentsService.isValid(a_UserAgents)) {
			_userAgentsService.createUserAgent(a_UserAgents);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	/**
	 * Delete  UserAgent by account id 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/account/useragent/{id}",method=RequestMethod.DELETE)
	public ResponseEntity < ? > deleteUserAgent(@PathVariable String id) {
		_userAgentsService.deleteUserAgent(id) ;
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
}
