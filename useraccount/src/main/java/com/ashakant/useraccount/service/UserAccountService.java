package com.ashakant.useraccount.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ashakant.useraccount.domain.UserAccount;
import com.ashakant.useraccount.repository.UserAccountRepository;

@Service
public class UserAccountService {

	@Autowired
	private UserAccountRepository _accountRepository;

	public boolean  isValid(UserAccount a_UserAccount) {
		/**
		 * Local validation 
		 */
		return true;
	}
	
	public UserAccountRepository get_accountRepository() {
		return _accountRepository;
	}

	public void set_accountRepository(UserAccountRepository _accountRepository) {
		this._accountRepository = _accountRepository;
	}
	
	public List<UserAccount> getUserAccountsById(){
		List<UserAccount> t_UserAccount=new ArrayList<UserAccount>() ;
		this._accountRepository.findAll().forEach(t_UserAccount::add);
		return t_UserAccount ;
	}
	
	public List<UserAccount> getAllUserAccounts(){
		List<UserAccount> t_UserAccount=new ArrayList<UserAccount>() ;
		this._accountRepository.findAll().forEach(t_UserAccount::add);
		return t_UserAccount ;
	}
	
	public void  createAccount(UserAccount a_UserAccount) {
		_accountRepository.save(a_UserAccount) ;
	}
	
	public UserAccount  readUserAccount(String a_Id) {
		return _accountRepository.findOne(a_Id) ;
	}
	
	
	public UserAccount  updateUserAccount(UserAccount a_UserAccount) {
		return _accountRepository.save(a_UserAccount) ;
	}
	
	
	public void  deleteUserAccount(String a_Id) {
		_accountRepository.delete(a_Id);
	}
}
