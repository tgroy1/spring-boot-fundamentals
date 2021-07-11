package com.tgroy.trackzilla.repository;

import org.springframework.data.repository.CrudRepository;

import com.tgroy.trackzilla.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
