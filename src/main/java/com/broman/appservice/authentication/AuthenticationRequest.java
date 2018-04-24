/**
 * @Project_Name broman 
 * @Package_Name com.broman.tokenauthentication
 * @File_Name AuthenticationRequest.java
 * @Author Sankar
 * @Created_date_time Feb 7, 2018
 */
package com.broman.appservice.authentication;

/**
 * @author MC6
 *
 */
public class AuthenticationRequest {
	private String username;
	private String password;
	private String plan_id;
	public AuthenticationRequest() {

	}
	public AuthenticationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	
	
}
