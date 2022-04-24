package com.practice.SpringBootSI.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car 
{
	public Car()
	{
		System.out.println("Car::Constructor");
	}
	
	private Engine eng=null;	
     
	@Autowired
	public void setEng(Engine eng) 
	{
		System.out.println("setEng() method called **");
		this.eng = eng;
	}
	
	public void drive()
	{
		
		Integer engStatus = eng.start();
		if(engStatus==0)
		{
			System.out.println("** Journey Started");
		}
		
		
	}
	

	
}
