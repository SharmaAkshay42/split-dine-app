package com.project.dinein.service;

import com.project.dinein.dao.PersonRepository;
import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private PersonRepository personRepository;

    @Autowired
    public CustomerService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(Person thePerson) {
        personRepository.save(thePerson);
    }

    public void deleteById(Integer theId) {
        personRepository.deleteById(theId);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(Integer theId) {
        Optional<Person> result = personRepository.findById(theId);

        Person thePerson = null;

        if (result.isPresent()) {
            thePerson = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find customer id - " + theId);
        }
        return thePerson;
    }


}
