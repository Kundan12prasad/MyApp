package com.practice.SpringBootStarter.sub;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@RequestMapping(value="/home")
	public String getmessage1()
	{
		return "Hello home page";
	}
	
	@RequestMapping(value="/About")
	public String getmessage2()
	{
		return "Hello about us";
	}
}
