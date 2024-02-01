package com.company.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.entity.Commande;
import com.company.project.entity.Notification;
import com.company.project.repository.NotificationRepository;
import com.company.project.service.observateur.EventListener;
import com.company.project.service.observateur.EventManager;

@Service
public class NotificationService implements EventListener {

	private final NotificationRepository notificationRepository;

	public EventManager evenement;

	@Autowired
	public NotificationService(NotificationRepository notificationRepository) {
		this.notificationRepository = notificationRepository;
	}

	@Override
	public void maj(String evenement, Commande commande) {
		if ("creation".equals(evenement)) {
			System.out.println("Commande créée avec l'ID : " + commande.getIdCommande());
			// TODO : ajouter creation de la notification
		} else if ("status".equals(evenement)) {
			System.out.println(
					"Le status de votre commande " + commande.getIdCommande() + "est passé à :" + commande.getStatus());
		} else {
			System.out.println("La date de livraison de votre commande " + commande.getIdCommande() + "est passé à :"
					+ commande.getDateLivraison());
		}
	}

	public Notification creerNotification(Notification notification) {
		Notification nouvelleNotification = notificationRepository.save(notification);
		return nouvelleNotification;
	}

	public Notification recupererNotificationParId(int id) {
		return notificationRepository.findById(id).orElse(null);
	}

	public void supprimerNotification(Notification notification) {
		notificationRepository.delete(notification);
	}

}
