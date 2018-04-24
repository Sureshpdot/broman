package com.broman.appservice.usermanagement;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface UserRepository extends CrudRepository<User, String>{
	@Override
	User findOne(String id);
	
	@Transactional(readOnly=false)
	//@Query("SELECT user FROM User user WHERE user.username = :username")
	@Query("{ 'username' : ?0 }")
	public List<User> findByUsername(@Param("username") String username);
	
	@Query("{'username' : ?0, 'active' : true, 'obsolete' : false}")
	//@Query("{'username' : ?0, 'active' : true, 'obsolete' : false}")
	public List<User> findByUserActive(@Param("username") String username);
	
	//@Query("{'plan' : {'$ref' : 'plan', '$id' : ?0}}")
	//@Query("{'plan' : {'id' : ?0}}")
	//@Query("{'username' : ?0}")
	//@Query("{'plan' :{'$ref' : 'plan', '$id' : ?0}}") // for list
	
	//public List<User> fetchbyPlan(String id);
}