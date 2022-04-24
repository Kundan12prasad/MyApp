package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.binding.Student;

@Controller
@RequestMapping(value="/app")
public class StudentController
{
	@GetMapping(value="/student")
	public String loadForm(Model model)
	{		
		model.addAttribute("student", new Student());		
		return "studentReg";		
	}
	
	@PostMapping(value="/saveStudent")
	public String handleSubmitForm(@ModelAttribute("student") Student std,Model model)
	{		
		System.out.println(std);		
		model.addAttribute("student",std);
		return "studentData";		
	}	
}
