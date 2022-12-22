package ru.akhmetov.springcourse.FirstRestApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.akhmetov.springcourse.FirstRestApp.models.Change;
import ru.akhmetov.springcourse.FirstRestApp.models.JsonObject;
import ru.akhmetov.springcourse.FirstRestApp.services.ObjDataService;

/**
 * @author Oleg Akhmetov on 20.12.2022
 */
@RestController
public class ObjDataController {
    private final ObjDataService objDataService;

    @Autowired
    public ObjDataController(ObjDataService objDataService) {
        this.objDataService = objDataService;
    }

    @PostMapping("/modify")
    public ResponseEntity<JsonObject> modify(@RequestBody Change change) {
        JsonObject object;
        try {
            object = objDataService.modify(change);
        } catch (Exception e ) {
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }

        return ResponseEntity.ok().body(object);
    }

}
