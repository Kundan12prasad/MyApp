package com.practice.SpringBootJunitMockito.serviceTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.practice.SpringBootJunitMockito.service.HelloService;

@SpringBootTest
public class HelloServiceTest 
{
	@Autowired
    HelloService helloService;

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testGet() 
    {
        assertEquals("Hello JUnit 5", helloService.get());
    }

}
