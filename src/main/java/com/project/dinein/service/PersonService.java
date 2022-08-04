package com.project.dinein.service;

import com.project.dinein.dao.PersonDAO;
import com.project.dinein.dao.PersonRepository;
import com.project.dinein.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDAO personDAO;

//    private final PersonRepository personDAO;

    @Autowired
    public PersonService(@Qualifier("FakePersonDAOImpl") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
//    public PersonService(PersonRepository personRepository) {
//        this.personDAO = personRepository;
//    }

    public int addPerson(Person person){
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDAO.selectAllPeople();
    }
//
//    public List<Person> findAll() {
//        return personDAO.findAll();
//    }
    public Optional<Person> getpersonById(int id){
        return personDAO.selectPersonById(id);
    }

//    public Person findById(int theId) {
//        Optional<Person> result = personDAO.findById(theId);
//
//        Person thePerson = null;
//
//        if (result.isPresent()) {
//            thePerson = result.get();
//        } else {
//            // we didn't find the employee
//            throw new RuntimeException("Did not find person id - " + theId);
//        }
//        return thePerson;
//    }

    public int deletePerson(int id){
        return personDAO.deletePersonById(id);
    }

    public int updatePerson(int id, Person person){
        return personDAO.updatePersonById(id,person);
    }

//    public void save(Person thePerson) {
//        personDAO.save(thePerson);
//    }
//
//    public void deleteById(int theId) {
//        personDAO.deleteById(theId);
//    }
}
