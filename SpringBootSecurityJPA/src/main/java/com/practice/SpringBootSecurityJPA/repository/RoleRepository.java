package com.practice.SpringBootSecurityJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.SpringBootSecurityJPA.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>
{
	

}
