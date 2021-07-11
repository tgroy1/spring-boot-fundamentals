package com.tgroy.conferencedemo.controllers;

import com.tgroy.conferencedemo.models.Speaker;
import com.tgroy.conferencedemo.repositories.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> list() {
        return speakerRepository.findAll();
    }

    @GetMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakerRepository.getById(id);
    }

    @PostMapping
    public Speaker create(@RequestBody final Speaker speaker) {
        return speakerRepository.saveAndFlush(speaker);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        //check for child records before delete
        speakerRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
        //Add validation
        Speaker existingSpeaker = speakerRepository.getById(id);
        BeanUtils.copyProperties(speaker, existingSpeaker, "speakerId");
        return speakerRepository.saveAndFlush(existingSpeaker);
    }
}
