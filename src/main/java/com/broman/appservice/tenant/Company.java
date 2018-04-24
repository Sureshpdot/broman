/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.tenant
 * @File_Name Company.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.appservice.tenant;

/**
 * @author MC6
 *
 */
public class Company {
	String comp_name;
	Comp_addr comp_addr;
	String comp_contact_no1, comp_contact_no2;
	String comp_tin_no, comp_gst_no;
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public Comp_addr getComp_addr() {
		return comp_addr;
	}
	public void setComp_addr(Comp_addr comp_addr) {
		this.comp_addr = comp_addr;
	}
	
	public String getComp_contact_no1() {
		return comp_contact_no1;
	}
	public void setComp_contact_no1(String comp_contact_no1) {
		this.comp_contact_no1 = comp_contact_no1;
	}
	public String getComp_contact_no2() {
		return comp_contact_no2;
	}
	public void setComp_contact_no2(String comp_contact_no2) {
		this.comp_contact_no2 = comp_contact_no2;
	}
	public String getComp_tin_no() {
		return comp_tin_no;
	}
	public void setComp_tin_no(String comp_tin_no) {
		this.comp_tin_no = comp_tin_no;
	}
	public String getComp_gst_no() {
		return comp_gst_no;
	}
	public void setComp_gst_no(String comp_gst_no) {
		this.comp_gst_no = comp_gst_no;
	}
	
}
