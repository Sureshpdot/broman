/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.role
 * @File_Name Role.java
 * @Author Sankar
 * @Created_date_time Apr 18, 2018
 */
package com.broman.appservice.role;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author MC6
 *
 */
@Document(collection = "role")
public class Role {
	@Id
	private String id;
	private String role_name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
}
