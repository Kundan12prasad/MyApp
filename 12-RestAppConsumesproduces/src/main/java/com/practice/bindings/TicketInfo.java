package com.practice.bindings;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class TicketInfo 
{	
	private Integer ticketId;
	private String ticketStatus;
	private String ticketPrice;
	private String from;
	private String to;
	private String bookedDate;
	private String name;
}
