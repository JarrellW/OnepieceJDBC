package com.example.onepiece.controller;

import com.example.onepiece.models.Pirate;
import com.example.onepiece.services.PirateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PirateController {
    @Autowired
    private PirateService pirateService;

    @PostMapping("pirate/addpirate")
    public ResponseEntity<Pirate> addPirate(@RequestBody Pirate pirate){
        return new ResponseEntity<>(pirateService.addPirate(pirate), HttpStatus.CREATED);
    }
    @GetMapping("pirate/name/{firstName}")
    public ResponseEntity<Pirate> getPirateByFirstName(@PathVariable String firstName){
        return new ResponseEntity<>(pirateService.getPirateByFirstName(firstName), HttpStatus.OK);
    }
    @GetMapping("pirate/willofD")
    public ResponseEntity<List<Pirate>> getWillOfD(){
        return new ResponseEntity<>(pirateService.getPirateByMiddleInitial("D"), HttpStatus.OK);
    }
    @GetMapping("pirate/crew/{pirateCrew}")
    public ResponseEntity<List<Pirate>> getPirateCrew(@PathVariable String pirateCrew){
        return new ResponseEntity<>(pirateService.getPirateByPirateCrew(pirateCrew), HttpStatus.OK);
    }
}
