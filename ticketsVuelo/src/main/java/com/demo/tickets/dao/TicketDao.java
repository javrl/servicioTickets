package com.demo.tickets.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.tickets.entity.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Long>{

}
