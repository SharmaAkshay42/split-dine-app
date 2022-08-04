package com.project.dinein.dao;

import com.project.dinein.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public interface PersonDAO {

    int insertPerson(int id, Person person);

    default int insertPerson(Person person){

        Random random = new Random();
        int id = random.nextInt();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();

    int deletePersonById(int id);

    int updatePersonById(int id, Person person);

    Optional<Person> selectPersonById(int id);




}
