package com.practice.SpringBootCrudProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.SpringBootCrudProduct.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>
{

	Product findByName(String name);
	

}
