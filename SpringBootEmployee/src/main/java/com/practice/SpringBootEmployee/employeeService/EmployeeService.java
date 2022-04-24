package com.practice.SpringBootEmployee.employeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.SpringBootEmployee.exception.RecordNotFoundException;
import com.practice.SpringBootEmployee.model.Employee;
import com.practice.SpringBootEmployee.employeeDao.EmployeeDao;

@Service
public class EmployeeService

{
	@Autowired
	EmployeeDao empDao;
	
	public List<Employee> getAllEmployees() throws RecordNotFoundException
	{
	List<Employee>employeelist=empDao.findAll();
	if(employeelist.size()>0)
	{
		return employeelist;
	}
	else
	{
		return new ArrayList<Employee>();
		
	}
	
	}	
	public Employee getEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<Employee> employee = empDao.findById(id);
         
        if(employee.isPresent())
        {
            return employee.get();
        } 
        
        else 
        {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
	
	public Employee createOrUpdateEmployee(Employee entity) throws RecordNotFoundException 
    {
        Optional<Employee> employee = empDao.findById(entity.getId());
         
        if(employee.isPresent()) 
        {
            Employee newEntity = employee.get();
            newEntity.setEmail(entity.getEmail());
            newEntity.setFirstName(entity.getFirstName());
            newEntity.setLastName(entity.getLastName()); 
            newEntity = empDao.save(newEntity);             
            return newEntity;
        }
        else 
        {
            entity = empDao.save(entity);
             
            return entity;
        }
    } 
	
	public void deleteEmployeeById(Long id) throws RecordNotFoundException 
    {
        Optional<Employee> employee = empDao.findById(id);
         
        if(employee.isPresent()) 
        {
        	empDao.deleteById(id);
        } 
        
        else 
        {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    } 
	
	

}
