package ru.akhmetov.springcourse.FirstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.akhmetov.springcourse.FirstRestApp.models.ObjData;

/**
 * @author Oleg Akhmetov on 20.12.2022
 */
@Repository
public interface ObjDataRepository extends JpaRepository<ObjData, Integer> {

}
