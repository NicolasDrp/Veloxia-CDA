package com.company.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.entity.Concessionnaire;
import com.company.project.repository.ConcessionnaireRepository;

@Service
public class ConcessionnaireService {

	private final ConcessionnaireRepository concessionnaireRepository;

	@Autowired
	public ConcessionnaireService(ConcessionnaireRepository concessionnaireRepository) {
		this.concessionnaireRepository = concessionnaireRepository;
	}

	public Concessionnaire creerConcessionnaire(Concessionnaire concessionnaire) {
		concessionnaireRepository.save(concessionnaire);
		return concessionnaire;
	}

	public Concessionnaire recupererConcessionnaireParId(int id) {
		return concessionnaireRepository.findById(id).orElse(null);
	}

	public List<Concessionnaire> recupererConcessionnaires() {
		return concessionnaireRepository.findAll();
	}

	public void supprimerConcessionnaire(Concessionnaire concessionnaire) {
		concessionnaireRepository.delete(concessionnaire);
	}
}