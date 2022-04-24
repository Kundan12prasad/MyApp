package com.practice.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Book
{
	private Integer bookId;
	private String bookName;
	private String bookISBN;
	private double bookPrice;

}
