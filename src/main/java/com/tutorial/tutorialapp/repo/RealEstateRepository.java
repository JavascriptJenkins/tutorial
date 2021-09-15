package com.tutorial.tutorialapp.repo;

import com.tutorial.tutorialapp.model.RealEstate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RealEstateRepository extends CrudRepository<RealEstate, Long> {

        List<RealEstate> findByLname(String lname);

}
