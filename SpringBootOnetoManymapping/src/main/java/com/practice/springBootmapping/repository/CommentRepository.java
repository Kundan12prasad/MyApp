package com.practice.springBootmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springBootmapping.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>
{
	

}
