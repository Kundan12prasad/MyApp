package com.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/registration")
public class HomeController 
{
	@RequestMapping(value="/home")
	public String getmessage1()
	{
		return "Hello home page";
	}
	
	@RequestMapping(value="/about")
	public String getmessage2()
	{
		return "Hello about us";
	}

}
