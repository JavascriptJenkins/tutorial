package com.tutorial.tutorialapp.repo;

import com.tutorial.tutorialapp.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository {


    public List<Person> getAllPerson(){

        return generateStaticPersonData();
    }




    List<Person> generateStaticPersonData(){

        List<Person> personList = new ArrayList<>();

        Person person = new Person();
        person.setPersonID(1);
        person.setFirstname("Jerry");
        person.setLastname("Stevens");
        person.setAge(17);
        person.setOccupation("Dairy Queen");

        personList.add(person);

        Person person2 = new Person();
        person2.setPersonID(2);
        person2.setFirstname("Lester");
        person2.setLastname("McEvans");
        person2.setAge(27);
        person2.setOccupation("Oracle");

        personList.add(person2);

        Person person3 = new Person();
        person3.setPersonID(3);
        person3.setFirstname("Rosie");
        person3.setLastname("Jenkins");
        person3.setAge(49);
        person3.setOccupation("Starbucks");

        personList.add(person3);

        Person person4 = new Person();
        person4.setPersonID(3);
        person4.setFirstname("Jamal");
        person4.setLastname("Jackson");
        person4.setAge(37);
        person4.setOccupation("Enterprise");

        personList.add(person4);

        return personList;

    }


}
