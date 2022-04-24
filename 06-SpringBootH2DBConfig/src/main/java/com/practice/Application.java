package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.entity.Student;
import com.practice.repository.StudentRepository;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		StudentRepository repo = ctxt.getBean(StudentRepository.class);
		Student std=new Student();
		std.setSname("Kundan");
		std.setSage(27);
		
		Student std1=new Student();
		std1.setSname("Amit");
		std1.setSage(29);
		
		repo.save(std);
		repo.save(std1);
		
	}

}
