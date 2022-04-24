package com.practice.SpringBootCrudH2.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.practice.SpringBootCrudH2.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket,Integer>
{

	void save(List<Ticket> ticket);
	

}
