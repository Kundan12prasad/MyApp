package com.practice.SpringBootEmployee.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)

public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("Kundan Prasad").password("Pass123").roles("ADMIN");
		//auth.inMemoryAuthentication().withUser("Normal User").password("Pass000").roles("USER");
	  } 	
	
	
	  @Override 
	  protected void configure(HttpSecurity http) throws Exception 
	  {
		 /* http.csrf().disable();
		 http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic(); */		  
		  
		//for enable the console  
	    http.csrf().disable();	  
	    http.headers().frameOptions().disable();	  
		http.authorizeRequests().antMatchers("/").permitAll().and()
        .authorizeRequests().antMatchers("/console/**").permitAll(); 
		 
	 // for accessing the secured controller request having admin role
		 
	  /*http
      .httpBasic()
          .and()
      .authorizeRequests()
          .antMatchers("/rest/**").permitAll()
          .and()
      .authorizeRequests()
          .antMatchers("/employee/**").hasAnyRole("ADMIN")
          .anyRequest().authenticated()
          .and()
      .formLogin()
          .permitAll();	  */
	  
	  }  	  
	  
	   @Bean
		public static NoOpPasswordEncoder passwordEndoder()
		{		
		return(NoOpPasswordEncoder)	NoOpPasswordEncoder.getInstance();
			
		}
			
	  
		

}
