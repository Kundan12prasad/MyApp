package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CUSTOMER_DTLS")
@Data
public class CustomerEntity
{
    @Id
    @GeneratedValue
    @Column(name="CUSTOMER_ID")    
	private int customerId;
    
    @Column(name="CUSTOMER_NAME")    
	private String customerName;
    
    @Column(name="CUSTOMER_EMAIL")
	private String customerEmail;	

}
