/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.tenant
 * @File_Name TenantController.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.appservice.tenant;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MC6
 *
 */
@RestController
@RequestMapping("/tenant")
public class TenantController {
	@Autowired
	private TenantRep tenantRep;
	
	@RequestMapping(value="/getTenantbyTenantPlan", method = RequestMethod.POST)
	public ResponseEntity<Tenant> getTenantbyTenantPlan(@RequestBody String tenant) throws JSONException{
		JSONObject json = new JSONObject(tenant);
		Tenant tenant1 = tenantRep.findOne(json.getString("tenant_id"));
		return new ResponseEntity<Tenant> (tenant1, HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateTenant", method = RequestMethod.PUT)
	public ResponseEntity<Tenant> updateTenant(@RequestBody Tenant tenant){
		tenantRep.save(tenant);
		return new ResponseEntity<Tenant> (tenant, HttpStatus.OK);
	}
}

