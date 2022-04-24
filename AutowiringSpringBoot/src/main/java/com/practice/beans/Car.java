package com.practice.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Car 
{
	@Autowired(required=false)
	@Qualifier("de")
	private Engine eng;
	
	public void drive()
	{
		Integer engStart = eng.start();
		if(engStart==0)
		{
			System.out.println("*****Journey Started******");
		}
		
	}
	

}
