package com.company.project.service;

import com.company.project.entity.Commande;
import com.company.project.repository.CommandeRepository;
import com.company.project.service.observateur.EventManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeService {

	private final CommandeRepository commandeRepository;

	public EventManager evenement;

	@Autowired
	public CommandeService(CommandeRepository commandeRepository) {
		this.commandeRepository = commandeRepository;
		this.evenement = new EventManager("creation", "status", "date");
	}

	public Commande creerCommande(Commande commande) {
		commandeRepository.save(commande);
		evenement.notifier("creation", commande);
		return commande;
	}

	public Commande recupererCommandeParId(int id) {
		return commandeRepository.findById(id).orElse(null);
	}

	public void supprimerCommande(Commande commande) {
		commandeRepository.delete(commande);
	}
}
