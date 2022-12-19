package ru.akhmetov.springcourse.FirstRestApp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.akhmetov.springcourse.FirstRestApp.models.Person;
import ru.akhmetov.springcourse.FirstRestApp.repositories.PeopleRepository;
import ru.akhmetov.springcourse.FirstRestApp.util.PersonNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


/**
 * @author Oleg Akhmetov on 24.11.2022
 */
@Service
@Transactional(readOnly = true) //Все методы readOnly, если не помечены аналогичной аннотацией
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> findAll() {
        return peopleRepository.findAll();
    }

    public Person findOne(int id) {
        Optional<Person> foundedPerson = peopleRepository.findById(id);
        return foundedPerson.orElseThrow(PersonNotFoundException::new);
    }

    @Transactional
    public void save (Person person) {
        enrichPerson(person);
        peopleRepository.save(person);
    }
    private void enrichPerson(Person person) {
        person.setCreatedAt(LocalDateTime.now());
        person.setUpdatedAt(LocalDateTime.now());
        person.setCreatedWho("ADMIN");
    }


}
