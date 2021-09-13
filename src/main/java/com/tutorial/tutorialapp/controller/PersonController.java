package com.tutorial.tutorialapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutorial.tutorialapp.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/person")
@RestController
public class PersonController {


    @Autowired
    PersonRepository personRepository;

    ObjectMapper objectMapper = new ObjectMapper();


    @GetMapping("/all")
    String getAllPerson() throws JsonProcessingException {

        return objectMapper.writeValueAsString(personRepository.getAllPerson());
    }





}
