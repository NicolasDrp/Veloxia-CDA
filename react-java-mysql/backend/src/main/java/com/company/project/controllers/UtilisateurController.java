package com.company.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.project.entity.Utilisateur;
import com.company.project.service.UtilisateurService;

@RestController
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;

	@GetMapping("/utilisateurs")
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurService.recupererUtilisateurs();
	}

	@PostMapping("/utilisateur")
	public Utilisateur creerUtilisateur(Utilisateur utilisateur) {
		return utilisateurService.creerUtilisateur(utilisateur);
	}

	@GetMapping("/utilisateur")
	public Utilisateur recupererUtilisateurParId(int id) {
		return utilisateurService.recupererUtilisateurParId(id);
	}

	@DeleteMapping("/utilisateur")
	public void supprimerUtilisateur(Utilisateur utilisateur) {
		utilisateurService.supprimerUtilisateur(utilisateur);
	}

}
