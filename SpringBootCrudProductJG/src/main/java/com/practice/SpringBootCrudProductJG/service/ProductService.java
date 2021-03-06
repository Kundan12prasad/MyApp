package com.practice.SpringBootCrudProductJG.service;

import com.practice.SpringBootCrudProductJG.entity.Product;

import java.util.List;

public interface ProductService
{
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);


}
