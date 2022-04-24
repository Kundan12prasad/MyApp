package com.practice.binding;

import lombok.Data;

@Data
public class Student 
{
	private Integer studentId;
	private String studentName;
	private String studentGender;
	private String courseName;
	private String[] timings;

}
