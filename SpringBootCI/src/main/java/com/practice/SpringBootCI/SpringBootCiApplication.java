package com.practice.SpringBootCI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.SpringBootCI.beans.Car;

@SpringBootApplication
public class SpringBootCiApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCiApplication.class, args);
	    Car car = context.getBean(Car.class);
	    car.drive();
	    
	
	}

}
