package com.practice.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Book
{

	private String isbn;
	private String name;
	private String author;
	private double price;	
	
}
