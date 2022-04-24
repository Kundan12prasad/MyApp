package com.practice.SpringBootJunitMockito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController 
{

	@ResponseBody
    @GetMapping("/")
	public String index(final Model model)
	{
        return "index";
	}
	
	
	
    public String hello() 
    {
        return "Hello Controller";
    }
	
}
