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
        Commande nouvelleCommande = commandeRepository.save(commande);
        evenement.notifier("creation", nouvelleCommande);
        return nouvelleCommande;
    }

    public Commande recupererCommandeParId(int id) {
        return commandeRepository.findById(id).orElse(null);
    }
}
