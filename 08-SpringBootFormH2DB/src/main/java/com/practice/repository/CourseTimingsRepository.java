package com.practice.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice.entites.CourseTimingsEntity;

@Repository
public interface CourseTimingsRepository extends JpaRepository<CourseTimingsEntity,Serializable>
{
	@Query("Select timing from CourseTimingsEntity")
	public List<String>getCourseTimings();

}
