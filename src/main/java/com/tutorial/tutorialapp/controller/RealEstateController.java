package com.tutorial.tutorialapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutorial.tutorialapp.repo.PersonRepository;
import com.tutorial.tutorialapp.repo.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/realestate")
@RestController
public class RealEstateController {


    @Autowired
    RealEstateRepository realEstateRepository;

    ObjectMapper objectMapper = new ObjectMapper();


    @GetMapping("/all")
    String getAllRealEstate() throws JsonProcessingException {

        return objectMapper.writeValueAsString(realEstateRepository.findAll());
    }





}
