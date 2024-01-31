package com.company.project.service.observateur;

import com.company.project.entity.Commande;

public interface EventListener {

	void maj(String evenement, Commande commande);
}
