package com.practice.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.practice.binding.Customer;

public class Unmarshalling 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("customer.xml");		
		JAXBContext context=JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Customer cobj = (Customer)unmarshaller.unmarshal(f);
		System.out.println(cobj);
	}

}
