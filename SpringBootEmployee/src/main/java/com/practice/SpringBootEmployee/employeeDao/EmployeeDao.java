package com.practice.SpringBootEmployee.employeeDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.practice.SpringBootEmployee.model.Employee; 

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> 
{
	
	
	

}
