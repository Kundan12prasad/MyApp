package com.practice.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/app")
public class WelcomeController
{	
	//@RequestMapping(value="/welcome",RequestMethod.GET)
	 @GetMapping(value="/welcome")
	 public ModelAndView displayWelcome()	
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome to Kundan IT");
		mav.setViewName("index");		
		return mav;
		
	}
      
	 @GetMapping(value="/greet")
	 public ModelAndView  displayGreet()
	 {
		  ModelAndView mav=new ModelAndView("index");
			mav.addObject("msg","Good Morning");
			//mav.setViewName("index");		
			return mav;			
	 }
	 
	 @GetMapping(value="/date")
	 public String displayDate(Model model)
	 {
		 model.addAttribute("msg","today's date is !! " +new Date());		 
		 return "index";
	 }
	
	
}
