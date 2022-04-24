package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.beans.Car;

@SpringBootApplication
public class AutowiringSpringBootApplication 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(AutowiringSpringBootApplication.class, args);
	    Car car = context.getBean(Car.class);
	    car.drive();
	}

}
