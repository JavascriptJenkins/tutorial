package com.tutorial.tutorialapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutorial.tutorialapp.model.RealEstate;
import com.tutorial.tutorialapp.repo.PersonRepository;
import com.tutorial.tutorialapp.repo.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/getByRowAmount")
    String getByRowAmount(@RequestParam("rows") String rows) throws JsonProcessingException {

        System.out.println("rows: "+rows);

        List<RealEstate> realEstateList = (List<RealEstate>) realEstateRepository.findAll();

        realEstateList = realEstateList.stream().limit(Long.parseLong(rows)).collect(Collectors.toList());

        return objectMapper.writeValueAsString(realEstateList);
    }



}
