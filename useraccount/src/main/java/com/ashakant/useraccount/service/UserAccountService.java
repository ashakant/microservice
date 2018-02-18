package com.ashakant.useraccount.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashakant.useraccount.domain.UserAccount;
import com.ashakant.useraccount.repository.AccountRepository;

@Service
public class UserAccountService {

	@Autowired
	private AccountRepository _accountRepository;

	public boolean  isValid(UserAccount a_UserAccount) {
		/**
		 * Local validation 
		 */
		return true;
	}
	
	public AccountRepository get_accountRepository() {
		return _accountRepository;
	}

	public void set_accountRepository(AccountRepository _accountRepository) {
		this._accountRepository = _accountRepository;
	}
	
	public List<UserAccount> getAllAccounts(){
		List<UserAccount> t_UserAccount=new ArrayList<UserAccount>() ;
		this._accountRepository.findAll().forEach(t_UserAccount::add);
		return t_UserAccount ;
	}
	
	public void  createAccount(UserAccount a_UserAccount) {
		_accountRepository.save(a_UserAccount) ;
	}
	
	public UserAccount  readAccount(Long a_Id) {
		return _accountRepository.findOne(a_Id) ;
	}
	
	public UserAccount  updateAccount(UserAccount a_UserAccount) {
		return _accountRepository.save(a_UserAccount) ;
	}
	
	public void  deleteAccount(Long a_Id) {
		_accountRepository.delete(a_Id);
	}
}
