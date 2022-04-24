package com.practice.SpringBootJunitMockito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.SpringBootJunitMockito.repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService
{
	   @Autowired
	    HelloRepository helloRepository;

	    @Override
	    public  String get()
	    {
	        return helloRepository.get();
	    }
	
	
}
