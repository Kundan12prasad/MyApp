package com.practice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.ContactMasterEntity;

@Repository
public interface ContactMasterRepo extends CrudRepository<ContactMasterEntity,Integer>
{
	
	
	
	

}
