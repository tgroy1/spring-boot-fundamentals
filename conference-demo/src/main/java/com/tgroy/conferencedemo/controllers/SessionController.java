package com.tgroy.conferencedemo.controllers;

import com.tgroy.conferencedemo.models.Session;
import com.tgroy.conferencedemo.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getById(id);
    }

    @PostMapping
    public Session create(@RequestBody final Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        //check for child records before delete
        sessionRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        //Add validation
        Session existingSession = sessionRepository.getById(id);
        BeanUtils.copyProperties(session, existingSession, "sessionId");
        return sessionRepository.saveAndFlush(existingSession);
    }
}
