package com.practice.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.practice.binding.Customer;

public class Marshalling
{
	public static void main(String[] args) throws Exception
	{
		Customer c=new Customer();
		c.setCustomerId(101);
		c.setCustomerName("Kundan Prasad");
		c.setCustomerEmail("kundanprasad29@gmail.com");
		
		//marshalling(java object -> XML)			
		JAXBContext context	=JAXBContext.newInstance(Customer.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(c,new File("customer.xml"));		
		
	}
}
