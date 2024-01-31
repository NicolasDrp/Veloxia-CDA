package com.company.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.company.project.entity.Voiture;

@Repository
public interface VoitureRepository extends CrudRepository<Voiture, Integer> {
}
