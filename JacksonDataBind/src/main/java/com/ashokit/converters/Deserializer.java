package com.ashokit.converters;
import com.ashokit.bindings.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Deserializer
{
	public static void main(String [] args) throws Exception
	{
		File f=new File("customer.json");
		ObjectMapper mapper=new ObjectMapper();
		Customer customerObj = mapper.readValue(f,Customer.class);
		System.out.println(customerObj);		
	}
	
	

}
