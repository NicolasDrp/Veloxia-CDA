package com.company.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.project.entity.Commande;
import com.company.project.service.CommandeService;

@RestController
public class CommandeController {

	@Autowired
	private CommandeService commandeService;

	@PostMapping("/commande")
	public Commande creerCommande(Commande commande) {
		return commandeService.creerCommande(commande);
	}

	@GetMapping("/commande")
	public Commande recupererCommandeParId(int id) {
		return commandeService.recupererCommandeParId(id);
	}

	@DeleteMapping("/commande")
	public void supprimerCommande(Commande commande) {
		commandeService.supprimerCommande(commande);
	}
}
