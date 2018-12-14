package com.matritel.kedua.entity.repository;

import com.matritel.kedua.entity.Person;

import java.util.List;

public interface PersonRepository {

    Person getbyID(int id);
    void save(Person person);
    void update( Person persi2);
    void delete(Person person);
    List<Person> getAllPersonsWithHQL();
    List<Person> getAllPersons();
    List<Person> getAllPersonsDeprecated();



}
