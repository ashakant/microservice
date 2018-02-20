package com.ashakant.useraccount.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashakant.useraccount.domain.UserAgents;
import com.ashakant.useraccount.repository.UserAgentsRepository;

@Service
public class UserAgentsService {

	@Autowired
	private UserAgentsRepository _userAgentsRepository;
	
	public boolean  isValid(UserAgents a_UserAccount) {
		/**
		 * Local validation 
		 */
		return true;
	}
	
	/**
	 * JPA Filter applied here
	 * @param a_Id
	 * @return
	 */
	public void  createUserAgent(UserAgents a_UserAgents) {
		//_accountRepository.findByid(a_id);
		_userAgentsRepository.save(a_UserAgents) ;
	}
	
	public List<UserAgents> getAllUserAgent(){
		List<UserAgents> t_UserAgents=new ArrayList<UserAgents>() ;
		this._userAgentsRepository.findAll().forEach(t_UserAgents::add);
		return t_UserAgents ;
	}
	
	public List<UserAgents> getUserAgentById(String a_UserAccountId){
		List<UserAgents> t_UserAgents=new ArrayList<UserAgents>() ;
		this._userAgentsRepository.findAll().forEach(t_UserAgents::add) ;
		return t_UserAgents ;
	}

	public UserAgents  updateUserAgent(UserAgents a_UserAccount) {
		return _userAgentsRepository.save(a_UserAccount) ;
	}
	
	public void  deleteUserAgent(String a_Id) {
		_userAgentsRepository.delete(a_Id);
	}
}