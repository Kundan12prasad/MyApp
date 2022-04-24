package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.domain.Book;

@Controller
@RequestMapping(value="/app")
public class BookController 
{
	@GetMapping("/price")
	@ResponseBody
	public  String getBookPrice(@RequestParam ("bname") String bookName)
	{
		String msgTxt="The Price of " +bookName+ " is:: 450";
		return msgTxt;
	}
	
	@GetMapping(value="/check")
	@ResponseBody
	public String checkAvailability(@RequestParam ("bookname") String bookName, @RequestParam("authorname") String authorName)
	{
		
		String msgTxt="The Book Name is " +bookName+ " written by " +authorName+ " is not available " ;
		return msgTxt;
	}
	
	@GetMapping(value="/add")
	@ResponseBody
	public String addData(Book book)
	{		
		String msg="Book Added Successfully";
		System.out.println(book);
		return msg;
		
	}
	
	
	
}

	

