package com.practice.SpringBootSI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.SpringBootSI.beans.Car;

@SpringBootApplication
public class SpringBootSiApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootSiApplication.class, args);
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
