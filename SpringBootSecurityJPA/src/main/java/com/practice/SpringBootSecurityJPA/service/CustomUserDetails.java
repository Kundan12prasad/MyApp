/*package com.practice.SpringBootSecurityJPA.service;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import com.practice.SpringBootSecurityJPA.model.User;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Service
public class CustomUserDetails implements UserDetails 

{
	private static final long serialVersionUID = 1256711395932122675L;
	private User user;

	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		// TODO Auto-generated method stub
		return user.getRoles().stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() 
	{		
		return user.getPassword();
	}

	@Override
	public String getUsername()
	{		
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() 
	{		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() 
	{		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired()
	{		
		return true;
	}

	@Override
	public boolean isEnabled()
	{
		return true;
	}

	public void setUser(User user2) 
	{
		// TODO Auto-generated method stub
		
	} 

	
	
	

} */
