package com.practice;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.entity.ContactMasterEntity;
import com.practice.repository.ContactMasterRepo;

@SpringBootApplication
public class SpringDataJpaFirstApplication
{
	public static void main(String[] args)  throws Exception
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFirstApplication.class, args);
		//ContactMasterRepo bean = context.getBean(ContactMasterRepo.class);
		ContactMasterRepo bean1 = context.getBean(ContactMasterRepo.class);
		//System.out.println(bean1.getClass().getName());
		
		/*ContactMasterEntity entity=new ContactMasterEntity();
		entity.setContactId(100);
		entity.setContactName("John");
		entity.setContactNumber(908767);	
		bean.save(entity); */
		
		/*ContactMasterEntity entity2=new ContactMasterEntity();
		entity2.setContactId(101);
		entity2.setContactName("Adam");
		entity2.setContactNumber(1234578911);
		bean.save(entity2);*/ 	
		
		//SaveAll()
		/*ContactMasterEntity entity3=new ContactMasterEntity();
		entity3.setContactId(103);
		entity3.setContactName("Amisha");
		entity3.setContactNumber(787564344);			
		
		ContactMasterEntity entity4=new ContactMasterEntity();
		entity4.setContactId(104);
		entity4.setContactName("Anita");
		entity4.setContactNumber(123897564);
		
		List<ContactMasterEntity> entityAll=new ArrayList<ContactMasterEntity>();
		entityAll.add(entity3);
		entityAll.add(entity4);		
		Iterable<ContactMasterEntity> allEntity = bean1.saveAll(entityAll);		
		System.out.println(allEntity); */
		
		//findById()
		/*Optional<ContactMasterEntity> findById = bean1.findById(120);
		System.out.println(findById); */
		
		//existById()
		/*boolean existsById = bean1.existsById(190);
		System.out.println(existsById);  */
		
		
		//findAll()
		/*Iterable<ContactMasterEntity> findAll = bean1.findAll();
		//System.out.println(findAll); 
		//by using for each method
		findAll.forEach(entity->{
			System.out.println(entity);
		}); */
		
		//findAllById()  [Not able to excecute]
		/*List<ContactMasterEntity>findAllById=new ArrayList<ContactMasterEntity>();
		findAllById.addAll(String.valueOf(101));
		findAllById */
		
		//count()
		/*long count = bean1.count();
		System.out.println(count); */
		
		//deleteById()
		//bean1.deleteById(104);
		
		//delete() ByEntity	 		
		//bean.delete(entity); 
		
		//deleteAll() arguments as collection	(not able to execute)	
	
		context.close();
	}
/* predefined methods for CrudRepository	
*	<S extends T> S save(S entity); 
 *  <S extends T> Iterable<S> saveAll(Iterable<S> entities);
 *  Optional<T> findById(ID id);
 *  boolean existsById(ID id);
 *  Iterable<T> findAll();
 *  Iterable<T> findAllById(Iterable<ID> ids);
 *  long count();
 *  void deleteById(ID id);
 *  void delete(T entity);
 *  void deleteAll(Iterable<? extends T> entities);
 *  void deleteAll();
 */
	
	
	

}
