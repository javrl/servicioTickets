package com.demo.tickets.services;

import java.util.Optional;

import com.demo.tickets.entity.Ticket;

public interface TicketService {
	
	public Optional <Ticket> getTickerId(Long id);
	
	
	public Ticket save(Ticket ticket);

}
