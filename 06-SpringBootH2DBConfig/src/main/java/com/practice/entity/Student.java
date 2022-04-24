package com.practice.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="STUDENT_DTLS")
public class Student 
{
	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private Integer sid;
	@Column(name="STUDENT_NAME")
	private String sname;
	@Column(name="STUDENT_AGE")
	private Integer sage;

}
