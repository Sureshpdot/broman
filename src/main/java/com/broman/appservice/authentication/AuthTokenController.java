/**
 * @Project_Name broman 
 * @Package_Name com.broman.tokenauthentication
 * @File_Name AuthTokenController.java
 * @Author Sankar
 * @Created_date_time Feb 7, 2018
 */
package com.broman.appservice.authentication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author MC6
 *
 */
@RestController
@RequestMapping("/authlogin")
public class AuthTokenController {
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	@Qualifier("customUserDetailsService")
	private UserDetailsService customUserDetailsService;
	
	@RequestMapping(value = "/authenticate", method = { RequestMethod.POST })
	public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
		
		try {
			String username = authenticationRequest.getUsername();
			String password = authenticationRequest.getPassword();
 			String plan_id = authenticationRequest.getPlan_id();
 			
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
			
			Authentication authentication = this.authenticationManager.authenticate(token);
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
			UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(username);
			
			List<String> roles = new ArrayList();
 			
			for (GrantedAuthority authority : userDetails.getAuthorities()) {
				roles.add(authority.toString());
			}
			if(!roles.get(0).equals(plan_id)) { // CHECKS PLAN
				 throw new NameNotFoundException("Username no found!");
			}
			return new ResponseEntity<>(new AuthenticationResponse(userDetails.getUsername(),roles,
					TokenUtil.createToken(userDetails),HttpStatus.OK),HttpStatus.OK);
 
		} catch (BadCredentialsException bce) {
			return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse(), HttpStatus.UNPROCESSABLE_ENTITY);
 
		} catch (NameNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        } catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		} 
 
	}
}
