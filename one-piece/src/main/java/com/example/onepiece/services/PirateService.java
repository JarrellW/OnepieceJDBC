package com.example.onepiece.services;

import com.example.onepiece.models.Pirate;
import com.example.onepiece.repository.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PirateService {
    @Autowired
    private PirateRepository pirateRepository;

    public Pirate addPirate(Pirate pirate){
        return pirateRepository.save(pirate);
    }
    public Pirate getPirateByFirstName(String firstName){
        return pirateRepository.findByFirstName(firstName);
    }
    public List<Pirate> getPirateByMiddleInitial(String middleInitial){
        return pirateRepository.findAllByMiddleInitial(middleInitial);
    }
    public List<Pirate> getPirateByPirateCrew(String pirateCrew){
        return pirateRepository.findAllByPirateCrew(pirateCrew);
    }
    public Iterable<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }
}
