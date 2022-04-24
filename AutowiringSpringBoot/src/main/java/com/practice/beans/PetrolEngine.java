package com.practice.beans;

import org.springframework.stereotype.Component;

@Component("pe")
public class PetrolEngine implements Engine
{
	@Override 
	public Integer start()
	{
		System.out.println("*** Petrol Engine:: start() method");
		return 0;
	}

}
