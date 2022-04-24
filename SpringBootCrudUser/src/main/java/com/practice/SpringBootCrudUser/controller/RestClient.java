package com.practice.SpringBootCrudUser.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.practice.SpringBootCrudUser.entity.User;

public class RestClient 
{
	//create the end points
	
	public static final String GET_ALL_USERS_API="http://localhost:9095/api/users";
	public static final String GET_USERS_BY_ID_API="http://localhost:9095/api/users/{id}";
	public static final String CREATE_USERS_API="http://localhost:9095/api/users";
	public static final String UPDATE_USERS_API="http://localhost:9095/api/users/{id}";
	public static final String DELETE_USERS_API="http://localhost:9095/api/users/{id}";
     
	static RestTemplate restTemplate=new RestTemplate();
	public static void main(String[] args)
	{
		
		callGetAllUsersAPI();
		callgetUserByIdAPI();
		 callCreateUserAPI();
		 callUpdateUserAPI();
		 callDeleteUserAPI();
		 
	}
	
	private static void callGetAllUsersAPI()
	{
		HttpHeaders headers= new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String>entity=new HttpEntity<>("parameters",headers);
   ResponseEntity<String>result=restTemplate.exchange(GET_ALL_USERS_API,HttpMethod.GET,entity,String.class);		
		System.out.println(result);		
	}
	
	
	private static void callgetUserByIdAPI()
	{
		Map<String,Integer>param=new HashMap<String,Integer>();
		param.put("id", 40);
		User user=restTemplate.getForObject(GET_USERS_BY_ID_API,User.class,param);
	    System.out.println(user.getFirstName());
	    System.out.println(user.getLastName());
	    System.out.println(user.getEmail());
	
	}
	
	private static void callCreateUserAPI() 
	{
		User user=new User("Mahesh","Kumar","mahesh.k@gmail.com");
	ResponseEntity<User> user2=  restTemplate.postForEntity(CREATE_USERS_API, user, User.class);
	System.out.println(user2.getBody());
	
	
	}
	
	private static void callUpdateUserAPI() 
	{
		Map<String,Integer>param=new HashMap<String,Integer>();
		param.put("id", 40);
		User userupdate=new User("Abhishek","jadav","abhishekyadav200@gmail.com");
		restTemplate.put(UPDATE_USERS_API, userupdate, param);
		
	}
	
	private static void callDeleteUserAPI()
	{
		Map<String,Integer>param=new HashMap<String,Integer>();
		param.put("id", 37);
		restTemplate.delete(DELETE_USERS_API,param);		
		
	}

}
