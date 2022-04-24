package com.practice.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COURSE_TIMINGS_DTLS")
public class CourseTimingsEntity
{
	
@Id
@GeneratedValue
@Column(name = "TIMING_ID")
private Integer timingId;

@Column(name = "TIMING")
private String timing;
}
