package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/app")

public class WelcomeRestController 
{
    @GetMapping(value={"/","/welcome"})
    //@ResponseBody
	public String getMsg()
	{		
		String msgTxt="Welcome to Restful webapp";
		return msgTxt;		
	}	
}
