package com.company.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_commande", nullable = false)
	private int idCommande;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "date_livraison", nullable = false)
	private String dateLivraison;

	@OneToOne
	@JoinColumn(name = "id_voiture", nullable = false)
	private Voiture voiture;

	@ManyToOne
	@JoinColumn(name = "id_utilisateur", nullable = false)
	private Utilisateur utilisateur;

	@ManyToOne
	@JoinColumn(name = "id_concessionnaire", nullable = false)
	private Concessionnaire concessionnaire;

	public Commande() {
		super();
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(String dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Concessionnaire getConcessionnaire() {
		return concessionnaire;
	}

	public void setConcessionnaire(Concessionnaire concessionnaire) {
		this.concessionnaire = concessionnaire;
	}

}
