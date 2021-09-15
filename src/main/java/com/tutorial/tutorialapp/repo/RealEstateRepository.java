package com.tutorial.tutorialapp.repo;

import com.tutorial.tutorialapp.model.RealEstate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RealEstateRepository extends CrudRepository<RealEstate, Integer> {

        List<RealEstate> findByLname(String lname);

        RealEstate findById(long id);

}
