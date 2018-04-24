/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.tenant
 * @File_Name Subscription.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.appservice.tenant;

import com.broman.appservice.usermanagement.Plan;

/**
 * @author MC6
 *
 */
public class Subscription {
	String subs_status;
	Plan plan;
	String current_term_start, current_term_end, next_billing_date, trial_term_end, started_at, activated_at, cancelled_at;
	public String getSubs_status() {
		return subs_status;
	}
	public void setSubs_status(String subs_status) {
		this.subs_status = subs_status;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public String getCurrent_term_start() {
		return current_term_start;
	}
	public void setCurrent_term_start(String current_term_start) {
		this.current_term_start = current_term_start;
	}
	public String getCurrent_term_end() {
		return current_term_end;
	}
	public void setCurrent_term_end(String current_term_end) {
		this.current_term_end = current_term_end;
	}
	public String getNext_billing_date() {
		return next_billing_date;
	}
	public void setNext_billing_date(String next_billing_date) {
		this.next_billing_date = next_billing_date;
	}
	public String getTrial_term_end() {
		return trial_term_end;
	}
	public void setTrial_term_end(String trial_term_end) {
		this.trial_term_end = trial_term_end;
	}
	public String getStarted_at() {
		return started_at;
	}
	public void setStarted_at(String started_at) {
		this.started_at = started_at;
	}
	public String getActivated_at() {
		return activated_at;
	}
	public void setActivated_at(String activated_at) {
		this.activated_at = activated_at;
	}
	public String getCancelled_at() {
		return cancelled_at;
	}
	public void setCancelled_at(String cancelled_at) {
		this.cancelled_at = cancelled_at;
	}
	
}
