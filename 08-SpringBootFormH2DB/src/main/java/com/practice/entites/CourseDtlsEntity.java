package com.practice.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COURSE_DTLS")
public class CourseDtlsEntity 
{
	@Id
	@GeneratedValue
	@Column(name="COURSE_ID")
	private Integer courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;	

}
