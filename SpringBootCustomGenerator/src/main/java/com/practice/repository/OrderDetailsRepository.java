package com.practice.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.OrderEntity;

public interface OrderDetailsRepository extends JpaRepository<OrderEntity,Serializable>
{
	

}
