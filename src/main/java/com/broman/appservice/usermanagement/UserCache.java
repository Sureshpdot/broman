/**
 * @Project_Name broman 
 * @Package_Name com.broman.user
 * @File_Name UserCache.java
 * @Author Sankar
 * @Created_date_time Feb 8, 2018
 */
package com.broman.appservice.usermanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author MC6
 *
 */
@Service
public class UserCache {
	@Autowired
	private UserRepository userRep;
	@Autowired
	private UserRepImpl userRepImpl;
	@CacheEvict
	public void clearCache(){}
	//@Cacheable(condition = "#cUsername.equals('sankar')")
	public String check_username(String cUsername){
		System.out.println("Entered name is "+cUsername);
		return cUsername;
	}
	
	@Cacheable(cacheNames = "username", key="#username")
	public List<User> fetchbyUsername(String username){
		return userRep.findByUsername(username);
	}
	@Cacheable(cacheNames="user", key="#user")
	public User fetchByPlan(String plan_id, String username){
		return userRepImpl.fetchByPlan(plan_id, username);
	}
}
