package com.practice.SpringBootCI.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car
{
	/*public Car()
	{
		System.out.println("Car:: 0 param Constructor");
	} */
	
	private Engine eng=null;	
    
	@Autowired
	public Car(Engine eng) 
	{
		System.out.println("Car:: 1 param Constructor**");
		this.eng = eng;
	}
	
	public void drive()
	{	
		Integer engStatus = eng.start();
		if(engStatus==1)
		{
			System.out.println("** Journey Started");
		}		
	}


}
