package com.atul.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.atul.main.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userrepo.findByUsername(username);
		
		if(user.getUsername()==null) throw new UsernameNotFoundException("User not found");
		
		UserPrincipal userprincipal = new UserPrincipal(user);
		System.out.println(user.getUsername());
		return userprincipal;
	}

}
