package com.practice.SpringBootFI.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car 
{
	@Autowired
	private Engine eng= null;
	
	public void drive()
	{
		Integer engStatus = eng.start();
		if(engStatus==0)
		{
			
			System.out.println("** Journey Started **");
		}
		
	}

}
