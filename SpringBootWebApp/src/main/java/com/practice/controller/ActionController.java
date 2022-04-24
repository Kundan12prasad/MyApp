package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ActionController 
{
	@PostMapping
	public String doWork()
	{
		return "index";
	}
	
	
	//for post request we have to send the data from client to server.
	@PostMapping(value="/action")
    public String doAction()
    {
		
		return "index";
    }
}
