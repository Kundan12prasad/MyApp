package com.practice.SpringBootStarter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
	@Autowired
	private  Food food;
 
 public void speak()
 {
	 System.out.println(" Hey--I can able to speak !!");
 }
 
 public void eat()
 {
	 food.recipes();
 }
 
 
}
