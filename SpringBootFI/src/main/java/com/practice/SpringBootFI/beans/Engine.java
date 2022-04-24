package com.practice.SpringBootFI.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine 
{
	public Engine()
	{
    System.out.println("Engine :: Constructor");
	}
	
	public Integer start()
	{		
		return 0;
	}

	

}
