/**
 * @Project_Name broman 
 * @Package_Name com.broman.user
 * @File_Name UserController.java
 * @Author Sankar
 * @Created_date_time Feb 8, 2018
 */
package com.broman.appservice.usermanagement;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MC6
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	/*@Autowired
	private UserCache userCache;
	@Autowired
	private UserRepository userRep;
	@Autowired
	private UserRepImpl userRepImpl;
	@RequestMapping(value="/checkUsername", method = RequestMethod.GET)
	public ResponseEntity<String> checkUsername(){
		String username = null;
		//userCache.clearCache();
		username = userCache.check_username("suresh");
		username = userCache.check_username("sankar");
		username = userCache.check_username("kotcha");
		username = userCache.check_username("sankar");
		username = userCache.check_username("tiru");
		return new ResponseEntity<String>(username, HttpStatus.OK); 
	}
	
	@RequestMapping(value="/fetchbyUsername", method = RequestMethod.POST)
	public ResponseEntity<List<User>> fetchbyUsername(@RequestBody String username) throws JSONException{
		log.warn("inside fetchbyusername");
		
		JSONObject json = new JSONObject(username);
		String name = json.getString("username");
		List<User> userList = userCache.fetchbyUsername(name);
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}
	
	//findByUserActive
	@RequestMapping(value="/findByUserActive", method = RequestMethod.POST)
	public ResponseEntity<User> findByUserActive(@RequestBody String user) throws JSONException{
		JSONObject json = new JSONObject(user);
		//List<User> userList = userRep.findByUserActive(json.getString("username"));
		//List<User> userList = userRep.fetchbyPlan(json.getString("username"));
		User users = userRepImpl.fetchByPlan(json.getString("plan_id"), json.getString("username"));
		System.out.println(json.getString("username"));
		return new ResponseEntity<User>(users, HttpStatus.OK);
	}*/
	
	@Autowired
	UserCache userCache;
	
	@Autowired
	UserRepository userRep;
	
	
	@RequestMapping(value="/checkUsername", method = RequestMethod.GET)
	public ResponseEntity<String> checkUsername(){
		String username = null;
		return new ResponseEntity<String>(username, HttpStatus.OK); 
	}
	
	@RequestMapping(value="/saveuser",method=RequestMethod.POST)
	public ResponseEntity<String> saveUser(@RequestBody User user){
		userRep.save(user);
		return new ResponseEntity<String>("Saved",HttpStatus.OK);	
	}
	
	@RequestMapping(value="/fetchUser",method=RequestMethod.POST)
	public ResponseEntity<User> fetchUser(@RequestBody String id){
		
		User user=null; 
		
		try {
			JSONObject json =new JSONObject(id);
			String userId=json.getString("id");
			user = userRep.findOne(userId);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/fetchAllUser", method=RequestMethod.GET)
	public ResponseEntity<List<User>> fetchAllUser(){
		List<User> listUser=(List<User>)userRep.findAll();
		return new ResponseEntity<List<User>>(listUser,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/updateUser",method=RequestMethod.PUT)
	public ResponseEntity<String> updateUser(@RequestBody User user){
		userRep.save(user);
	 	return new ResponseEntity<String>("Updated",HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@RequestBody User user){
		userRep.delete(user);
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
		
	} 
	
 	@RequestMapping(value="/fetchbyUsername", method = RequestMethod.POST)
	public ResponseEntity<List<User>> fetchbyUsername(@RequestBody String username) throws JSONException{
		log.warn("inside fetchbyusername");
		try {
			JSONObject json = new JSONObject(username);
			String name = json.getString("username");
			List<User> userList = userCache.fetchbyUsername(name);
			return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
