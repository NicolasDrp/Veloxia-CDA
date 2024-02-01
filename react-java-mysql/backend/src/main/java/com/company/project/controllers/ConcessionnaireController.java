package com.company.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.entity.Concessionnaire;
import com.company.project.service.ConcessionnaireService;

@RestController
public class ConcessionnaireController {

	@Autowired
	private ConcessionnaireService concessionnaireService;

	@GetMapping("/concessionnaire")
	public Concessionnaire recupererConcessionnaireParId(int id) {
		return concessionnaireService.recupererConcessionnaireParId(id);
	}

	@GetMapping("/concessionnaires")
	public List<Concessionnaire> recupererConcessionnaires() {
		return concessionnaireService.recupererConcessionnaires();
	}

	@PostMapping("/concessionnaire")
	public Concessionnaire creerConcessionnaire(Concessionnaire concessionnaire) {
		return concessionnaireService.creerConcessionnaire(concessionnaire);
	}

	@DeleteMapping("/concessionnaire")
	public void supprimerConcessionnaire(Concessionnaire concessionnaire) {
		concessionnaireService.supprimerConcessionnaire(concessionnaire);
	}

}
