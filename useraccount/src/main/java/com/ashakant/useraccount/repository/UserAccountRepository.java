package com.ashakant.useraccount.repository;


import com.ashakant.useraccount.domain.UserAccount;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserAccountRepository extends CrudRepository</*Entity*/ UserAccount,
/*Id , Primary Key of Table must match data types of Primary Key*/String>{
	
	/**
	 * 
	 */
	public List<UserAccount> findByid(String id) ;
}
 
