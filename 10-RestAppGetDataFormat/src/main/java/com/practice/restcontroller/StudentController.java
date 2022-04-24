package com.practice.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bindings.Book;

@RestController
public class StudentController 
{
	
	@GetMapping(value="/getbookdata", produces={"application/json", "application/xml"})
	public ResponseEntity<Book> getData()
	{	
		Book bobj=new Book(); 
		//Hard Code the Data 
		bobj.setBookId(500);
		bobj.setBookName("Spring");
		bobj.setBookISBN("ISBN001");
		bobj.setBookPrice(590.00);		
		return new ResponseEntity<Book>(bobj,HttpStatus.OK);		
	}
	

}
