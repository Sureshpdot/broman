/**
 * @Project_Name broman 
 * @Package_Name com.broman.test
 * @File_Name NamingController.java
 * @Author Sankar
 * @Created_date_time Feb 14, 2018
 */
package com.broman.test;

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
@RequestMapping("/test")
public class NamingController {
	
	@RequestMapping(value="/jsontopojo", method = RequestMethod.POST)
	public ResponseEntity<User> jsontopojo(@RequestBody User nam) {
		return new ResponseEntity<User>( nam, HttpStatus.OK);
	}
	
}
