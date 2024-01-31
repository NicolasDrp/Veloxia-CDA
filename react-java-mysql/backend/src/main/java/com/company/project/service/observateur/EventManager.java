package com.company.project.service.observateur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.company.project.entity.Commande;

public class EventManager {
    Map<String, List<EventListener>> observeurs = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.observeurs.put(operation, new ArrayList<>());
        }
    }

    public void suivre(String evenement, EventListener observeur) {
        List<EventListener> users = observeurs.get(evenement);
        users.add(observeur);
    }

    public void plusSuivre(String evenement, EventListener observeur) {
        List<EventListener> users = observeurs.get(evenement);
        users.remove(observeur);
    }

    public void notifier(String evenement, Commande commande) {
        List<EventListener> utilisateurs = observeurs.get(evenement);
        for (EventListener observeur : utilisateurs) {
            observeur.maj(evenement, commande);
        }
    }
}
