package com.company.project.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "notification")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_notification", nullable = false)
	private int idNotification;

	@Column(name = "message", nullable = false)
	private String message;

	@Column(name = "date_envoie", nullable = false)
	private Date dateEnvoie;

	@ManyToOne
	@JoinColumn(name = "id_commande", nullable = false)
	private Commande idCommande;

	public Notification() {
		super();
	}

	public int getIdNotification() {
		return idNotification;
	}

	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDateEnvoie() {
		return dateEnvoie;
	}

	public void setDateEnvoie(Date dateEnvoie) {
		this.dateEnvoie = dateEnvoie;
	}

	public Commande getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Commande idCommande) {
		this.idCommande = idCommande;
	}
}
