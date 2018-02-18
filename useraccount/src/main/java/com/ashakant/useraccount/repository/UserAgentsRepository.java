package com.ashakant.useraccount.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.ashakant.useraccount.domain.UserAgents;

@Transactional
public interface UserAgentsRepository extends CrudRepository</*Entity*/ UserAgents,
/*Id , Primary Key of Table must match data types of Primary Key*/String>{
	
	/**
	 * 
	 */
	public List<UserAgents> findByid(String id) ;
	
}
 
