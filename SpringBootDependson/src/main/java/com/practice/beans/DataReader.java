package com.practice.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("dr")
@DependsOn("dw")
public class DataReader
{
	public DataReader() 
	{
		System.out.println("logic to read the data from file");
		
	}
	

}
