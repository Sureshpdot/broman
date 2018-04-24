/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.usermanagement
 * @File_Name UserRepImpl.java
 * @Author Sankar
 * @Created_date_time Apr 18, 2018
 */
package com.broman.appservice.usermanagement;

import java.util.List;

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
public class UserRepImpl {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	@SuppressWarnings("unchecked")
	public User fetchByPlan(String plan_id, String username){
		//Query query = new Query(Criteria.where("plan.$id").is(new ObjectId(planid))); //single query
		Query query = new Query(new Criteria().andOperator(Criteria.where("username").is(username),
				Criteria.where("active").is(true), Criteria.where("obsolete").is(false),
				Criteria.where("plan.$id").is(new ObjectId(plan_id))));
		return mongoTemplate.findOne(query, User.class);
	}
	
}
