package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.domain.BookDomain;

@RequestMapping(value="/app")
@Controller
public class BookController 
{
	@GetMapping(value="/book")
	public String getBookData(Model model)
	{
		BookDomain book =new BookDomain();
		book.setBookId(100);
		book.setBookName("Spring");
		book.setBookPrice(500.90);
		model.addAttribute("book",book);			
		return "pageOne";
	}
	
	@GetMapping(value="/books")
	public String getBooksData(Model model)
	{
		BookDomain book1 =new BookDomain();
		book1.setBookId(101);
		book1.setBookName("java");
		book1.setBookPrice(300.00);
		
		BookDomain book2 =new BookDomain();
		book2.setBookId(102);
		book2.setBookName("SpringBoot");
		book2.setBookPrice(400.00);
		
		BookDomain book3 =new BookDomain();
		book3.setBookId(103);
		book3.setBookName("Microservice");
		book3.setBookPrice(600.00);
		
		
		List<BookDomain> booksList=new ArrayList<BookDomain>();
		booksList.add(book1);
		booksList.add(book2);
		booksList.add(book3);		
		
		model.addAttribute("books",booksList);	
		return "pageTwo";
	}
		
	//here we are sending the raw data from controller to browser. 
   //	There is no need to create one specific view(.jsp)
	
		@GetMapping(value="/data")
		@ResponseBody
		public  BookDomain getRawData()
		{
			BookDomain domain=new BookDomain();
			domain.setBookId(200);
			domain.setBookName("Big Data");
			domain.setBookPrice(800.00);
			System.out.println(domain);
			return domain ;				
		}
		
		
	}
	
	
	
	
	
	

