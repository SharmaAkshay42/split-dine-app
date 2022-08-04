package com.project.dinein.api;

import com.project.dinein.model.Person;
import com.project.dinein.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody  Person person){

        personService.addPerson(person);
//        personService.save(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){

        return personService.getAllPeople();
//        return personService.findAll();
    }

    @GetMapping(path ="{id}")
    public Person getPersonById(@PathVariable("id") int id){

        return personService.getpersonById(id).orElse(null);
//        return personService.findById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") int id){

        personService.deletePerson(id);
//        personService.deleteById(id);
    }

//    @PutMapping(path = "{id}")
//    public void updatePerson(@PathVariable("id") int id,@RequestBody Person personToUpdate){
//        personService.updatePerson(id,personToUpdate);
//    }
}
