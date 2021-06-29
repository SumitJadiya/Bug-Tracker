package com.stj.repository;

import org.springframework.data.repository.CrudRepository;

import com.stj.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
