/**
 * @Project_Name broman 
 * @Package_Name com.broman.test
 * @File_Name Role.java
 * @Author Sankar
 * @Created_date_time Feb 14, 2018
 */
package com.broman.test;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author MC6
 *
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Role {
	private int id;
	private String roleName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
