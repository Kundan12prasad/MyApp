package com.practice.SpringBootStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class SpringAutowireApplication
{
	public static void main(String[] args) 
	
	{
		/*ApplicationContext con=SpringApplication.run(SpringAutowireApplication.class, args);
		 Person person=con.getBean(Person.class);		
		 person.speak();
		 person.eat(); */
		
		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
		Person person=con.getBean(Person.class);
		person.speak();
		person.eat(); 
		
		
	}

}
