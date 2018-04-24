/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.usermanagement
 * @File_Name Plan.java
 * @Author Sankar
 * @Created_date_time Apr 18, 2018
 */
package com.broman.appservice.usermanagement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author MC6
 *
 */
@Document(collection = "plan")
public class Plan {
	@Id
	private String id;
	private String plan_name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	
}
