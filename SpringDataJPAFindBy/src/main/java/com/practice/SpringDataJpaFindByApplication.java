package com.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.practice.entity.CustomerEntity;
import com.practice.repository.CustomerRepo;

@SpringBootApplication
public class SpringDataJpaFindByApplication
{
	public static void main(String[] args) 

	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFindByApplication.class, args);
	    CustomerRepo repo = context.getBean(CustomerRepo.class);
	    System.out.println(repo.getClass().getName());
	    
	    //creating entity object
	     /*CustomerEntity entity1=new CustomerEntity();
	     
	     entity1.setCustomerName("Kundan");
	     entity1.setCustomerEmail("kundan.p@gmail.com");	    
	     
	     CustomerEntity entity2=new CustomerEntity();
	     entity2.setCustomerName("Anish");
	     entity2.setCustomerEmail("Anish.s@gmail.com");
	     
	     CustomerEntity entity3=new CustomerEntity();
	     entity3.setCustomerName("Abhishek");
	     entity3.setCustomerEmail("Abhishek.y@gmail.com");  
	     
	     CustomerEntity entity4=new CustomerEntity();
	     entity3.setCustomerName("Anita");
	     entity3.setCustomerEmail("anita.k@gmail.com");  
	    
	    
	    //adding multiple data at a time (saveAll())
	    List<CustomerEntity> allEntity=new ArrayList<CustomerEntity>();
	    allEntity.add(entity1);
	    allEntity.add(entity2);
	    allEntity.add(entity3); 
	    allEntity.add(entity4);	    
	    
	    Iterable<CustomerEntity> saveAll = repo.saveAll(allEntity); 
	    System.out.println(saveAll); */
	    
	   /* CustomerEntity entity5=new CustomerEntity();
	    entity5.setCustomerName("Raju");
	    entity5.setCustomerEmail("Raju.p@gmail.com");
	    repo.save(entity5);
	    
	    CustomerEntity entity6=new CustomerEntity();
	    entity6.setCustomerName("Sarita");
	    entity6.setCustomerEmail("sarita.p@gmail.com");
	    repo.save(entity6); */
	    
	    
	    //findBy  derived query	    
	    /*CustomerEntity findByCustomerEmail = repo.findByCustomerEmail("anish.s@gmail.com");
	    System.out.println(findByCustomerEmail);  */
	    
	   /* CustomerEntity findByCustomerName = repo.findByCustomerName("Amit");
	    System.out.println(findByCustomerName);	   */  
	    
	  /* CustomerEntity findByCustomerNameAndCustomerEmail = repo.findByCustomerNameAndCustomerEmail("Kundan","kundan.p@gmail.com");
	    System.out.println(findByCustomerNameAndCustomerEmail);  */
	    
	   //calling custom query 
	    
	    /*List<String> findAllNames = repo.findAllNames();
	    System.out.println(findAllNames); */
	    
	    /*List<String>findAllCustomerName = repo.findAllCustomerName();
	    System.out.println(findAllCustomerName);  */  
	    
	    //Jpa sorting
	   /* List<CustomerEntity> sortedList = repo.findAll(Sort.by("customerName"));
	    sortedList.forEach(entity->
	    {
	    	System.out.println(entity);
	    	
	    } ); */
	    
	    //JpaDecending sorting
	    List<CustomerEntity> sortedList = repo.findAll(Sort.by("customerName").descending());
	    sortedList.forEach(entity->
	    {
	    	System.out.println(entity);
	    	
	    });    
	    
	    //pagination 
	    
	    int pageNo=0;
	    int pageSize=2;
	    Page<CustomerEntity> page = repo.findAll(PageRequest.of(pageNo,pageSize));
	   List<CustomerEntity> content = page.getContent();
	    content.forEach(entity->
	   {
		   System.out.println(entity);
	   });
	  }

}
