package com.broman.appservice.usermanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.broman.appservice.tenant.Subscription;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	UserRepository userRep;
	@Autowired
	UserRepImpl userRepImpl;
	@Transactional(readOnly=true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<User> userList = userRep.findByUsername(username);
		User user = userList.get(0);
		
		List<GrantedAuthority> authorities = buildUserAuthority(user);
		return buildUserForAuthentication(user, authorities);
	}
	
	private org.springframework.security.core.userdetails.User buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
		// TODO Auto-generated method stub
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
	}
	
	private List<GrantedAuthority> buildUserAuthority(User user) {
		// TODO Auto-generated method stub
		
		List<GrantedAuthority> grandAuthority = new ArrayList<GrantedAuthority>();
		grandAuthority.add(new SimpleGrantedAuthority(user.getRole().getRole_name()));
		
		grandAuthority.add(new SimpleGrantedAuthority(user.getPlan().getId()));
		grandAuthority.add(new SimpleGrantedAuthority(user.getTenant().getId()));
		for(Subscription subs : user.getTenant().getSubscription()){
			if(subs.getPlan().getId().equals(user.getPlan().getId())){
				grandAuthority.add(new SimpleGrantedAuthority(subs.getSubs_status()));
			}
		}
		return grandAuthority;
	}
}