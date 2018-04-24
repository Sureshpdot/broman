/**
 * @Project_Name broman 
 * @Package_Name com.broman.applog
 * @File_Name AppLog.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.applog;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.broman.appservice.tenant.Tenant;
import com.broman.appservice.usermanagement.Plan;
import com.broman.appservice.usermanagement.User;

/**
 * @author MC6
 *
 */
@Document(collection = "application_log")
public class AppLog {
	@Id
	private String id;
	private String log_collection, log_item, log_action, log_desc;
	private Tenant tenant;
	private Plan plan;
	private User user;
	private String log_date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLog_collection() {
		return log_collection;
	}
	public void setLog_collection(String log_collection) {
		this.log_collection = log_collection;
	}
	public String getLog_item() {
		return log_item;
	}
	public void setLog_item(String log_item) {
		this.log_item = log_item;
	}
	public String getLog_action() {
		return log_action;
	}
	public void setLog_action(String log_action) {
		this.log_action = log_action;
	}
	public String getLog_desc() {
		return log_desc;
	}
	public void setLog_desc(String log_desc) {
		this.log_desc = log_desc;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getLog_date() {
		return log_date;
	}
	public void setLog_date(String log_date) {
		this.log_date = log_date;
	}
	
}
