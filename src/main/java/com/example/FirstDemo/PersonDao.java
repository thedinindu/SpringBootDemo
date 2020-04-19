package com.example.FirstDemo;

import org.hibernate.validator.constraints.EAN;
import org.hibernate.validator.constraints.Email;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person); // inserting a person by given ID

    default int insertPerson(Person person) { // inserting a person by without an ID(Random)
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
