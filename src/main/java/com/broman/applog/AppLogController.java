/**
 * @Project_Name broman 
 * @Package_Name com.broman.applog
 * @File_Name AppLogController.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.applog;

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
@RequestMapping("/applog")
public class AppLogController {
	@Autowired
	private AppLogRep appLogRep;
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> applogSave(@RequestBody AppLog applog){
		appLogRep.save(applog);
		return new ResponseEntity<String> (HttpStatus.OK);
	}
}
