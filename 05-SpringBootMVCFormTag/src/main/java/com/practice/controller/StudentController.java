package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.practice.domain.Student;

@Controller
@RequestMapping(value="/app")
public class StudentController 
{
	@GetMapping(value="/student")
	public String loadForm(Model model)
	{
		Student sobj= new Student();	
		model.addAttribute("student",sobj);
		return "index";			
	}
	
	@PostMapping(value="/saveStudent")
	public String handleSubmitBtn(@ModelAttribute("student")Student std, Model model)
	{
		System.out.println(std);		
		model.addAttribute("succMsg", "Student Registered..!!");
		return "index";		
	}
	
	
}
