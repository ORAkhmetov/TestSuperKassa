package ru.akhmetov.springcourse.FirstRestApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.akhmetov.springcourse.FirstRestApp.models.Person;


import java.util.Optional;

/**
 * @author Oleg Akhmetov on 24.11.2022
 */
@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
