package com.practice.SpringBootSecurityBasic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthController

{
	@RequestMapping("/sayHi")
	public String SayHi()
	{
		
		return "Hello!!";
	}

}
