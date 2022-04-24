package com.practice.SpringBootCrudUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.SpringBootCrudUser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
	
	

}
