package com.company.project.repository;

import com.company.project.entity.Concessionnaire;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcessionnaireRepository extends CrudRepository<Concessionnaire, Integer> {
	List<Concessionnaire> findAll();
}
