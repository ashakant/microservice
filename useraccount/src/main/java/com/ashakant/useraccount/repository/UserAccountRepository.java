package com.ashakant.useraccount.repository;


import com.ashakant.useraccount.domain.UserAccount;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface AccountRepository extends CrudRepository</*Entity*/ UserAccount,
/*Id , Primary Key of Table must match data types of Primary Key*/Long>{
	
	/**
	 * 
	 */
	//public List<UserAgents> findById(string id) ;
}
 