package com.practice.springbootmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springbootmapping.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>
{
	

}