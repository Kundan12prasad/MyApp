package com.practice.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.bindings.Student;
import com.practice.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService service;

	@GetMapping("/student")
	public String loadForm(Model model)
	{
	model.addAttribute("student", new Student());
	model.addAttribute("genders",service.getGenders());
	model.addAttribute("courses",service.getCourses());
	model.addAttribute("timings",service.getCourseTimings());
	return "registration";	
	}
	
	@PostMapping("/saveStudent")
	public String handleSubmitBtn(@ModelAttribute("student") Student std,Model model)
	{
		System.out.println(std);
		model.addAttribute("timings",Arrays.toString(std.getTimings()));
		model.addAttribute("std",std);
		return "success";		
		 
	}
	
	
}
