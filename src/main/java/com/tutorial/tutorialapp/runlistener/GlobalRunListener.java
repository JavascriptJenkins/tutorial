package com.tutorial.tutorialapp.runlistener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutorial.tutorialapp.model.RealEstate;
import com.tutorial.tutorialapp.repo.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class GlobalRunListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    RealEstateRepository realEstateRepository;


    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("Application started!");
        translateData();

    }

    void translateData(){

        System.out.println("Converting real estate json data to h2!");

        // create Object Mapper
        ObjectMapper mapper = new ObjectMapper();

        RealEstate[] listRealEstate = null;
        List<RealEstate> realEstateList = new ArrayList<>();
        // read JSON file and map/convert to java POJO
        try {
            listRealEstate = mapper.readValue(new File("src/main/resources/house-data-json.json"), RealEstate[].class);
            System.out.println(listRealEstate);

        } catch (IOException e) {
            e.printStackTrace();
        }


        for(RealEstate realEstate: listRealEstate){

            RealEstate newObject = new RealEstate();

            newObject.setFname(realEstate.getFname());
            newObject.setLname(realEstate.getLname());
            newObject.setYrblt(realEstate.getYrblt());
            newObject.setIsnew(realEstate.isIsnew());
            newObject.setSqft(realEstate.getSqft());
            newObject.setBaths(realEstate.getBaths());
            newObject.setBeds(realEstate.getBeds());
            newObject.setStreet(realEstate.getStreet());
            newObject.setCity(realEstate.getCity());
            newObject.setState(realEstate.getState());
            newObject.setZip(realEstate.getZip());
            newObject.setListing(realEstate.getListing());

            realEstateRepository.save(realEstate);
        }


    }
}
