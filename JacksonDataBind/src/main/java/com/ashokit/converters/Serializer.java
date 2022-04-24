package com.ashokit.converters;

import com.ashokit.bindings.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer 
{
	public static void main(String args[]) throws Exception
	{
		Customer c=new Customer();
		c.setCustomerId(100);
		c.setCustomerName("Kundan");
		c.setCustomerEmail("kundanprasad29@gmail.com");
		
		ObjectMapper mapper=new ObjectMapper();
		//String customerJson = mapper.writeValueAsString(c);		
		String customerJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(c);
		System.out.println(customerJson);
		
	}

}
