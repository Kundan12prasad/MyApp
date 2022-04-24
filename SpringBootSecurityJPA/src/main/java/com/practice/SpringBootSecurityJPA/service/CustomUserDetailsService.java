/*package com.practice.SpringBootSecurityJPA.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;
import com.practice.SpringBootSecurityJPA.model.User;
import com.practice.SpringBootSecurityJPA.repository.UserRepository;

@Service
public abstract class CustomUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepository repository;
	
	public UserDetails loadUserByName(String username) throws UsernameNotFoundException
	{
		User user = repository.findByUsername(username);
		CustomUserDetails userDetails = null;
		if (user != null) 
		{
			userDetails = new CustomUserDetails();
			userDetails.setUser(user);
		} 
		
		else 
		{
			throw new UsernameNotFoundException("User not exist with name : " + username);
		}
		return userDetails;	
		
		
	}

	

	
	
	
	
} */
