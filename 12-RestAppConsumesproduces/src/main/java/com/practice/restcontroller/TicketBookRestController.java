package com.practice.restcontroller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bindings.PassengerInfo;
import com.practice.bindings.TicketInfo;

@RestController
public class TicketBookRestController
{	
	@PostMapping(value="/bookticket",consumes= {"application/xml","application/json"}, 
			produces= {"application/xml","application/json"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passenger)
	{	
		System.out.println(passenger);		
		TicketInfo ticket=new TicketInfo();		
		ticket.setTicketId(10986);
		ticket.setTicketStatus("Confirmed");
		ticket.setTicketPrice("2000");
		ticket.setFrom("Kolkata");
		ticket.setTo("Banglore");
		ticket.setName(passenger.getName());
		ticket.setBookedDate(new Date() + " ");		
		
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
	}
	

}
