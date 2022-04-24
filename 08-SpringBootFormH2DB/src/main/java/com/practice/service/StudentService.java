package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.repository.CourseTimingsRepository;
import com.practice.repository.CoursesRepository;
import com.practice.repository.GendersRepository;

@Service
public class StudentService 
{
	@Autowired
	private GendersRepository gendersRepo;
	
	@Autowired
	private CourseTimingsRepository courseTimingsRepo;
	
	@Autowired
	private CoursesRepository coursesRepo;
	
	public List<String>getGenders()
	{
		return gendersRepo.getGendersDetails();
	}	
	
	public List<String>getCourses()
	{
		return coursesRepo.getCourseDetails();
	}	
	
	public List<String>getCourseTimings()
	 {
		return courseTimingsRepo.getCourseTimings();		
	}
}
