/**
 * @Project_Name broman 
 * @Package_Name com.broman.appservice.tenant
 * @File_Name TenantRep.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.appservice.tenant;

import org.springframework.data.repository.CrudRepository;

/**
 * @author MC6
 *
 */
public interface TenantRep extends CrudRepository<Tenant, String> {

}
