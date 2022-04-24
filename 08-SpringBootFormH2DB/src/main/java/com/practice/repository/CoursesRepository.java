package com.practice.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice.entites.CourseDtlsEntity;

@Repository
public interface CoursesRepository extends JpaRepository<CourseDtlsEntity,Serializable>
{
	@Query("Select courseName from CourseDtlsEntity")
	public List<String>getCourseDetails();	

}
