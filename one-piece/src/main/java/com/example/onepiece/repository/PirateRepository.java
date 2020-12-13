package com.example.onepiece.repository;

import com.example.onepiece.models.Pirate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends CrudRepository<Pirate, Long> {
    List<Pirate> findAllByMiddleInitial(String middleInitial);
    List<Pirate> findAllByPirateCrew(String pirateCrew);
    Pirate findByFirstName(String firstName);
}
