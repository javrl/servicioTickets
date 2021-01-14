package com.demo.tickets.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.tickets.dao.TicketDao;
import com.demo.tickets.entity.Ticket;
import com.demo.tickets.services.TicketService;


@RestController
public class TicketVueloController {
	
	
	@Autowired
	private TicketService ticketService;
	
	
	@GetMapping("/obtenerTicket/{id}")
	public ResponseEntity<?> obtenerTicket(@PathVariable(value="id") Long id){
		
		Optional<Ticket> ticket = ticketService.getTickerId(id);
		
		if(ticket.isEmpty()) {
			
			return ResponseEntity.notFound().build();
			
		}
		
		return ResponseEntity.ok(ticket.get());

	}
	
	@PostMapping("/crearTicket")
	public ResponseEntity<?> crearItinerario(@RequestBody Ticket ticket){
		
		
		Ticket newTicket = ticketService.save(ticket);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(newTicket);
		
	}

}
