package com.demo.tickets.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.tickets.dao.TicketDao;
import com.demo.tickets.entity.Ticket;


@Service
public class TickerServiceImpl implements TicketService {
	
	
	@Autowired
	private TicketDao tickerDao;

	@Override
	@Transactional(readOnly = true)
	public Optional<Ticket> getTickerId(Long id) {

		return tickerDao.findById(id);
	}

	@Override
	@Transactional
	public Ticket save(Ticket ticket) {
		return tickerDao.save(ticket);
	}

}
