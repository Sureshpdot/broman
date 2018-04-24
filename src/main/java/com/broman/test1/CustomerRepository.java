/**
 * @Project_Name broman 
 * @Package_Name com.broman.test1
 * @File_Name CustomerRepository.java
 * @Author Sankar
 * @Created_date_time Apr 7, 2018
 */
package com.broman.test1;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author MC6
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, String>{
	@Transactional(readOnly=false)
	@Query("{ 'f_name' : ?0 }")
	public List<Customer> findByCustomerName(@Param("f_name") String f_name);
	 @Query(value="{ 'emailAddress.$id' : ?0 }")
	 public List<EmailAddress> findByBrandId(Integer id); 
}
