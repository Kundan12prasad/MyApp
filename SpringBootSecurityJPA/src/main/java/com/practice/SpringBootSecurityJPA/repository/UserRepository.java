package com.practice.SpringBootSecurityJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.SpringBootSecurityJPA.model.User;


public interface UserRepository extends JpaRepository<User, Integer>
{

	  User findByUsername(String username);
}
