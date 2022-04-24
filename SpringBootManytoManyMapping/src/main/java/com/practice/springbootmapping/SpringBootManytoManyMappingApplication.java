package com.practice.springbootmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.practice.springbootmapping.entity.Post;
import com.practice.springbootmapping.entity.Tag;
import com.practice.springbootmapping.repository.PostRepository;

@SpringBootApplication
public class SpringBootManytoManyMappingApplication implements CommandLineRunner
{
	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootManytoManyMappingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception 
	{
		Post post = new Post("Hibernate Many to Many Mapping Example with Spring Boot", 
				"Hibernate Many to Many Mapping Example with Spring Boot", 
				"Hibernate Many to Many Mapping Example with Spring Boot");
		
		Post post1 = new Post("Hibernate One to Many Mapping Example with Spring Boot", 
				"Hibernate One to Many Mapping Example with Spring Boot", 
			"Hibernate One to Many Mapping Example with Spring Boot");


		Tag springBoot = new Tag("Spring Boot");
		Tag hibernate = new Tag("Hibernate");
		
		      // add tag references post
				post.getTags().add(springBoot);
				post.getTags().add(hibernate);

				// add post references tag
				springBoot.getPosts().add(post);
				hibernate.getPosts().add(post);
				
			//one to many  mapping	
				springBoot.getPosts().add(post1);
			    post1.getTags().add(springBoot);	
				
				this.postRepository.save(post);
				
				this.postRepository.save(post1);
		
	}

}
