package com.practice.springbootmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springbootmapping.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
	

	
}
