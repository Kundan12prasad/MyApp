package com.practice.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice.entites.GenderDtlsEntity;

@Repository
public interface GendersRepository extends JpaRepository<GenderDtlsEntity,Serializable>
{
    @Query("Select genderTxt from GenderDtlsEntity")
	public  List<String>getGendersDetails();
	
}
