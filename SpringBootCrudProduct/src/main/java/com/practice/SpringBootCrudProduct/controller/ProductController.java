package com.practice.SpringBootCrudProduct.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.SpringBootCrudProduct.service.ProductService;
import com.practice.SpringBootCrudProduct.model.Product;


@RestController
public class ProductController
{
	@Autowired
	private ProductService service;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product )
	{
		return  service.saveProduct(product);
		 //return  new ResponseEntity<Product>(addedproduct, new HttpHeaders(), HttpStatus.OK);
	} 
	
	@PostMapping("/addproducts")
	public  List<Product> addProducts(@RequestBody List<Product> product ) 
	{
		return service.saveProducts(product);
	}
	
	@GetMapping("/getProducts")
	public List<Product> findAllProduts( ) 
	{
		return service.getproducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public  Product findProdutById(@PathVariable int id) 
	{		
		 return service.getProductById(id);
		//return new ResponseEntity<Product>(pid, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product findProdutByName(@PathVariable String name) 
	{
		return service.getProductByName(name);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) 
	{
		return service.updateProduct(product);
				
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id)  
	{
		return service.deleteProduct(id);
	}	
	
	

}
