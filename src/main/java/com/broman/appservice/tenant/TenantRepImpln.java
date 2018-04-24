/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.tenant
 * @File_Name TenantRepImpln.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.appservice.tenant;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * @author MC6
 *
 */
@Repository
public class TenantRepImpln {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Tenant fetchByTenant(String tenant_id) {
		/*Query query = new Query(new Criteria().andOperator(Criteria.where("id").is(tenant_id),
				Criteria.where("subscription.plan.$id").is(new ObjectId(plan_id))));*/
		Query query = new Query(new Criteria().andOperator(Criteria.where("id").is(tenant_id)));		
		return mongoTemplate.findOne(query, Tenant.class);
	}
}
