package com.practice.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Car 
{
	private Integer id;
	private String brand;
	private String color;
	private Integer model;

}
