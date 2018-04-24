/**
 * @Project_Name broman 
 * @Package_Name com.broman.test
 * @File_Name NamingBean.java
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
public class User {
	private int id;
    private String beanName;
    private Role role;
    
    
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
    
    
}
