package com.practice.SpringBootCrudUser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;



@Entity
@Table(name = "users")

public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	@NotNull
    @Size(min=2,message="First name should have at least 2 character")
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull
    @Size(min=2,message="Last name should have at least 2 character")
	@Column(name = "last_name")
	private String lastName;
     
	@NotNull
	@Size(min=6, message="email must be greater than 6 letter")
	@Column(name = "email")
	private String email;

	public User() 
	  {}

	public User(String firstName, String lastName, String email) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;		
		this.email = email;
	}

	public long getId() 
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	 }
}
 


