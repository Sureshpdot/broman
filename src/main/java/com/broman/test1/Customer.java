/**
 * @Project_Name broman 
 * @Package_Name com.broman.test1
 * @File_Name Customer.java
 * @Author Sankar
 * @Created_date_time Apr 7, 2018
 */
package com.broman.test1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author MC6
 *
 */
@Document(collection = "customer")
public class Customer {
	@Id
	private String id;
	private String f_name, l_name;
	private Address address;
	
	@DBRef
	private EmailAddress emailAddress;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public EmailAddress getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
