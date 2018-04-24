/**
 * @Project_Name broman 
 * @Package_Name com.broman.applog
 * @File_Name AppLogRep.java
 * @Author Sankar
 * @Created_date_time Apr 19, 2018
 */
package com.broman.applog;

import org.springframework.data.repository.CrudRepository;

/**
 * @author MC6
 *
 */
public interface AppLogRep extends CrudRepository<AppLog, String> {

}
