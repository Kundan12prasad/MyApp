package com.practice.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Customer 
{
	private Integer customerId;
	private String customerName;
	private String customerLocation;

}
