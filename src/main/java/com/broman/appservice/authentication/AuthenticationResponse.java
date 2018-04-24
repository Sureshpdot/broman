/**
 * @Project_Name broman 
 * @Package_Name com.broman.tokenauthentication
 * @File_Name AuthenticationResponse.java
 * @Author Sankar
 * @Created_date_time Feb 7, 2018
 */
package com.broman.appservice.authentication;

import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;

/**
 * @author MC6
 *
 */
public class AuthenticationResponse {

	private String username;
	private List<String> roles;
	private String token;
	private HttpStatus status;
	
	public AuthenticationResponse(String username, List<String> roles, String token, HttpStatus status) {
		super();
		this.username = username;
		this.roles = roles;
		this.token = token;
		this.status = status;
	}
	
	public AuthenticationResponse() {
		this.token = "";
		this.username = "";
		this.roles = Collections.emptyList();
		this.status = HttpStatus.NOT_FOUND;
	}

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	
}
