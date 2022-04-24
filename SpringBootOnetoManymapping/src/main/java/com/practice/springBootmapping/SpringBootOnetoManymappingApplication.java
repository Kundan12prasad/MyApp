package com.practice.springBootmapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.springBootmapping.entity.Post;
import com.practice.springBootmapping.entity.Comment;
import com.practice.springBootmapping.repository.PostRepository;

@SpringBootApplication
public class SpringBootOnetoManymappingApplication implements CommandLineRunner
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootOnetoManymappingApplication.class, args);
	}
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		Post post = new Post("one to many mapping using JPA & hibernate", "one to many mapping using JPA & hibernate");
		
		Comment comment4= new Comment("Very exiting");
		Comment comment5 = new Comment("attractive");
		Comment comment6 = new Comment("Liked it");
		
		post.getComments().add(comment4);
		post.getComments().add(comment5);
		post.getComments().add(comment6);
		
		this.postRepository.save(post);
	}


}
