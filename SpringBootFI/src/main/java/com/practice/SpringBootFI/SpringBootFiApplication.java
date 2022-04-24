package com.practice.SpringBootFI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.SpringBootFI.beans.Car;

@SpringBootApplication
public class SpringBootFiApplication 
{
	public static void main(String[] args) 
	{
		 ConfigurableApplicationContext context = SpringApplication.run(SpringBootFiApplication.class, args);
	      Car car = context.getBean(Car.class);
	      car.drive();
	}

}
