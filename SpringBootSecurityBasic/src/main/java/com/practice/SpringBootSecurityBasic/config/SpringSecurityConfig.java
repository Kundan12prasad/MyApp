package com.practice.SpringBootSecurityBasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("Kundan Prasad").password("Pass123").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("Normal User").password("Pass000").roles("USER");
	}
	
	//Security for all API	
	
	
	/*
	 * @Override 
	 * protected void configure(HttpSecurity http) throws Exception 
	 * {
	 * http.csrf().disable();
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * }
	 */
	
	
	//Security Based on URL
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable();
	 * http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().
	 * httpBasic();
	 * 
	 * }
	 */
	
	//Security based on role
	
	
	  @Override 
	  protected void configure(HttpSecurity http) throws Exception
	  {
	  http.csrf().disable();
	  http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("ADMIN")
	  .anyRequest().fullyAuthenticated().and().httpBasic();
	  
	  }
	 
	
	@Bean
	public static NoOpPasswordEncoder passwordEndoder()
	{		
	return(NoOpPasswordEncoder)	NoOpPasswordEncoder.getInstance();
		
	}
		
		
	}



