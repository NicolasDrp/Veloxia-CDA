package com.company.project.repository;

import com.company.project.entity.Modele;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeleRepository extends CrudRepository<Modele, Integer> {
    List<Modele> findAll();
}
