package com.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bindings.Book;

@RestController
public class BookController
{	
	@GetMapping(value="/book", produces= {"application/xml","application/json"})
	public ResponseEntity<Book> getBook(@RequestParam("isbn") String isbn)
	{
		Book book=new Book();
		if(isbn.equals("ISBN001"))
		{
			book.setIsbn(isbn);
		    book.setName("Spring");
		    book.setAuthor("Rod Johnson");
		    book.setPrice(450.00);			
		}
		
		else
		   {
			book.setIsbn(isbn);
			book.setName("Hibernate");
			book.setAuthor("Gaven King");
			book.setPrice(500.90);			
			}			
			return new ResponseEntity<Book>(book,HttpStatus.OK);
			
		}
		
		
	}
	
	


