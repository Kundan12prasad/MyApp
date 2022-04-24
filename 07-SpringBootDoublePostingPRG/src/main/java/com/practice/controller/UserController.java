package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.practice.model.User;

@Controller
public class UserController
{
	@RequestMapping(value={"/", "/createUserAccnt"},method=RequestMethod.GET)
	public String loadUserForm(Model model)
	{	User user=new User();
		model.addAttribute("userModel", user);		
		return "createUserAccnt";		
	}
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)
	public String handleSubmitBtn(@ModelAttribute("userModel") User user,RedirectAttributes attributes)
	{
		System.out.println("user form submitted:: " +user);
		//model.addAttribute();
		attributes.addFlashAttribute("msg", "Account created successfully");
		return "redirect:/userAccntCreationSuccess";
	}
	
	@RequestMapping(value="/userAccntCreationSuccess", method=RequestMethod.GET)
	public String userAccntCreationSuccess(Model model)
	{	
		User user=new User();
		System.out.println("userAccntCreationSuccess method called");
		model.addAttribute("userModel",user);
		return "createUserAccnt"; 
	} 
}
