/**
 * @Project_Name broman 
 * @Package_Name com.broman.tokenauthentication
 * @File_Name AuthTokenConfig.java
 * @Author Sankar
 * @Created_date_time Feb 7, 2018
 */
package com.broman.appservice.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component("authTokenConfig")
public class AuthTokenConfig extends SecurityConfigurerAdapter <DefaultSecurityFilterChain, HttpSecurity>{

	@Autowired
	@Qualifier("customUserDetailsService")
	private UserDetailsService userDetailsService;

	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		AuthTokenFilter customFilter = new AuthTokenFilter(userDetailsService);
		http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
	}
}