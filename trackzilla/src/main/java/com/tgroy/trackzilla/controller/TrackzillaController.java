package com.tgroy.trackzilla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tgroy.trackzilla.exception.ApplicationNotFoundException;
import com.tgroy.trackzilla.model.Application;
import com.tgroy.trackzilla.model.Ticket;
import com.tgroy.trackzilla.service.ApplicationService;
import com.tgroy.trackzilla.service.TicketService;

@RestController
@RequestMapping("/track")
public class TrackzillaController {
	
	@Autowired
	private ApplicationService applicationService;
	@Autowired
    private TicketService ticketService;
	
	@GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getTickets() {
        return new ResponseEntity<List<Ticket>>(ticketService.listTickets(), HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getApplications() {
        return new ResponseEntity<List<Application>>(applicationService.listApplications(), HttpStatus.OK);
    }

    @GetMapping("/application/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Application>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }

}
