package com.practice.SpringBootCrudH2.model;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="Ticket_2000")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket
{
	@Id
	@GeneratedValue
	private Integer id;
	private double price;
	private String category;

}
