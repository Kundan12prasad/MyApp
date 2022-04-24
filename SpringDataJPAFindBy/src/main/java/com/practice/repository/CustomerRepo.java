package com.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practice.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity,Integer>
{
   //findBy user defined query
	
	public CustomerEntity findByCustomerEmail(String email);
	public CustomerEntity findByCustomerName(String name);
	
	public CustomerEntity findByCustomerNameAndCustomerEmail(String name,String email);
	public CustomerEntity findByCustomerNameOrCustomerEmail(String name,String email);
	
	//custom query	
	@Query(value="select customerName from CustomerEntity")
	public List<String>findAllNames();
	
	@Query(value="select CUSTOMER_NAME from CUSTOMER_DTLS", nativeQuery=true)
	public List<String>findAllCustomerName();	
}
