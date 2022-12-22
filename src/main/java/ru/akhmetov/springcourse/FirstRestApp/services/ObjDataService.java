package ru.akhmetov.springcourse.FirstRestApp.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.akhmetov.springcourse.FirstRestApp.models.Change;
import ru.akhmetov.springcourse.FirstRestApp.models.JsonObject;
import ru.akhmetov.springcourse.FirstRestApp.models.ObjData;
import ru.akhmetov.springcourse.FirstRestApp.repositories.ObjDataRepository;



/**
 * @author Oleg Akhmetov on 20.12.2022
 */
@Service
public class ObjDataService {
    private final ObjDataRepository objDataRepository;

    @Autowired
    public ObjDataService(ObjDataRepository objDataRepository) {
        this.objDataRepository = objDataRepository;
    }

    public JsonObject modify(Change change) {
        ObjData founded = objDataRepository.findById(change.getId()).get();
        int value = founded.getJsonObject().getCurrent();
        founded.getJsonObject().setCurrent(value + change.getAdd());
        objDataRepository.save(founded);
        return founded.getJsonObject();
    }
}
