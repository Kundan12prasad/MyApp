package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Contact_MSTR_Entity")
@Data
public class ContactMasterEntity 
{
	@Id
	@Column(name="CID")
	private int contactId;
	@Column(name="CNAME")
	private String contactName;
	@Column(name="CNUMBER")
	private long contactNumber;

}
