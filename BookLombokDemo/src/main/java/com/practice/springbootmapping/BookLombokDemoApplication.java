package com.practice.springbootmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.springbootmapping.model.Book;

@SpringBootApplication
public class BookLombokDemoApplication {
	
	public static void main(String[] args) 
	{
		SpringApplication.run(BookLombokDemoApplication.class, args);
		
		/*Book book=new Book();
		book.setId(1);
		book.setName("Java Programming");
		book.setAuthor("Kundan Prasad");
		
		System.out.println("value of Object are : " +book.toString());  */
		
		
		Book b= new Book(100,"Python","Abhishek Yadav");
		System.out.println("Value of Object is :" +b.toString());
		
		
		
	}

}
