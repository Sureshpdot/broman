/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.tenant
 * @File_Name Tenant.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.appservice.tenant;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author MC6
 *
 */
@Document(collection = "tenant")
public class Tenant {
	@Id
	private String id;
	private int account_id;
	private Company company;
	private List<Subscription> subscription;
	private String created_date, updated_date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAccount_id() {
		return account_id;
	}
	
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(List<Subscription> subscription) {
		this.subscription = subscription;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	
	
}
