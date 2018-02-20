package com.ashakant.useraccount.repository;


import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ashakant.useraccount.domain.UserAccount;

@Transactional
public interface UserAccountRepository extends JpaRepository</*Entity*/ UserAccount,
/*Id , Primary Key of Table must match data types of Primary Key*/String>{
	
	/**
	 * 
	 */
	//public List<UserAccount> findByid(String id) ;
}
 
