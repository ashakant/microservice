package com.ashakant.useraccount.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ashakant.useraccount.domain.UserAgents;

@Transactional
public interface UserAgentsRepository extends JpaRepository</*Entity*/ UserAgents,
/*Id , Primary Key of Table must match data types of Primary Key*/String>{
	
	/**
	 * 
	 */
	//public List<UserAgents> findByid(String id) ;
	
}
 
