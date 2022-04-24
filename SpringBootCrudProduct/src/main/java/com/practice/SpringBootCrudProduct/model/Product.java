package com.practice.SpringBootCrudProduct.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;

@Entity
@Table(name="TBL_PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data

public class Product
{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}	
	
	
	
	}	
	

