package com.practice.springbootmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springbootmapping.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag,Long>
{
	

}
