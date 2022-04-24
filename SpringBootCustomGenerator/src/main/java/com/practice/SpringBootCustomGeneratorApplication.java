package com.practice;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.entity.OrderEntity;
import com.practice.repository.OrderDetailsRepository;

@SpringBootApplication
public class SpringBootCustomGeneratorApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootCustomGeneratorApplication.class, args);
		OrderDetailsRepository bean = ctxt.getBean(OrderDetailsRepository.class);
		
		OrderEntity orderEntity=new OrderEntity();
		
		/*orderEntity.setOrderBy("Kundan");
		orderEntity.setOrderPlacedDate(new Date());
		OrderEntity savedEntity = bean.save(orderEntity);
		System.out.println(savedEntity); */
		
		OrderEntity orderEntity1=new OrderEntity();
		orderEntity1.setOrderBy("Rajat");
		orderEntity1.setOrderPlacedDate(new Date());
		OrderEntity savedEntity2 = bean.save(orderEntity1);
		System.out.println(savedEntity2);
		
		ctxt.close();
		
	
	}

}
