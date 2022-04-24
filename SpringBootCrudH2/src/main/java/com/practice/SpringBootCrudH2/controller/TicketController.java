package com.practice.SpringBootCrudH2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practice.SpringBootCrudH2.model.Ticket;
import java.util.List;
import com.practice.SpringBootCrudH2.dao.TicketDao;

@RestController
@RequestMapping("/tickets")
public class TicketController
{
	@Autowired
	private TicketDao ticketdao;
	
	@PostMapping("/booktickets")
	public String bookTicket(@RequestBody List<Ticket> ticket)
	{		
		ticketdao.save(ticket);
		return "booked ticket: " +ticket.size();
	}
	
	@GetMapping("/gettickets")
	public List<Ticket>getTicket()
	{
		return (List<Ticket>) ticketdao.findAll();
	}
	

}
