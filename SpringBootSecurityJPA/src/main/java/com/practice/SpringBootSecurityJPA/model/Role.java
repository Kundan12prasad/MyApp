package com.practice.SpringBootSecurityJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="Role_100")
public class Role 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int role_id;
	private String role;
	
}
	
	
	
