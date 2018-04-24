/**
 * @Project_Name broman 
 * @Package_Name com.broman.test1
 * @File_Name EmailAddress.java
 * @Author Sankar
 * @Created_date_time Apr 9, 2018
 */
package com.broman.test1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author MC6
 *
 */
@Document(collection = "emailAddress")
public class EmailAddress {
	@Id
	private String id;
	private String value;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
