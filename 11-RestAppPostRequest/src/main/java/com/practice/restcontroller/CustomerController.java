package com.practice.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bindings.Customer;

@RestController
public class CustomerController 
{
	@PostMapping(value="/addcustomer", consumes= {"application/xml","application/json"})
	public ResponseEntity<String> addCustomer(Customer customerObj)
	{
		customerObj.setCustomerId(400);
		customerObj.setCustomerName("Kundan");
		customerObj.setCustomerLocation("Kolkata");
		System.out.println(customerObj);
		
		//logic to insert data from database
		String rspTxt="Customer Record Created Successfully  " +customerObj;		
		return new ResponseEntity<>(rspTxt,HttpStatus.CREATED);
	}
	
	

}
