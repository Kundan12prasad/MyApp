package com.practice.SpringBootStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication

@ComponentScan("com.practice.SpringBootStarter")
@SpringBootConfiguration
@EnableAutoConfiguration

public class SpringBootStarterApplication 

{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootStarterApplication.class, args);
		
	}

}
