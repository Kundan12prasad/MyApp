package com.practice.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bindings.Car;

@RestController
public class CarController 
{   
	@GetMapping(value="/car/{id}", produces= {"application/json", "application/xml"})
	public ResponseEntity<Car> getCar(@PathVariable("id") Integer id)
	{
		Car car=new Car();
		if(id==101)
		{
		car.setId(id);
		car.setBrand("BMW");
		car.setColor("Yellow");
		car.setModel(2018);			
	    }		
		else
		{
			car.setId(id);
			car.setBrand("Suzuki");
			car.setColor("Red");
			car.setModel(2017);			
		}		
		return new ResponseEntity<Car>(car,HttpStatus.OK);		
		}

}
