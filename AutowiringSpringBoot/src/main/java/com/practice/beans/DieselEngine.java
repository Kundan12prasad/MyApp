package com.practice.beans;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements Engine
{	
	@Override
	public Integer start()
	{
		System.out.println("*** Diesel Engine:: start() method");
		return 0;
	}

}
