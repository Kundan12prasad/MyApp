package com.practice.binding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer implements Serializable
{
	private Integer customerId;
	private String customerName;
	private String customerEmail;
	
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	public String getCustomerEmail()
	{
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail)
	{
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + "]";
	}
	
	
	
	
	

}
