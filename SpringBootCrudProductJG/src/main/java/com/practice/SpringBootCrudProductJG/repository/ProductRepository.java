package com.practice.SpringBootCrudProductJG.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.SpringBootCrudProductJG.entity.Product;

@Repository
public interface ProductRepository extends  JpaRepository<Product,Long> 
{
	

}
