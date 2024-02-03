package com.company.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modele")
public class Modele {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_modele", nullable = false)
	private int idModele;

	@Column(name = "nom_modele", nullable = false)
	private String nomModele;

	@Column(name = "description_modele", nullable = false)
	private String descriptionModele;

	@Column(name = "portes", nullable = false)
	private int portes;

	@Column(name = "prix_modele", nullable = false)
	private int prixModele;

	public Modele() {
		super();
	}

	public int getIdModele() {
		return idModele;
	}

	public void setIdModele(int idModele) {
		this.idModele = idModele;
	}

	public String getNomModele() {
		return nomModele;
	}

	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}

	public String getDescriptionModele() {
		return descriptionModele;
	}

	public void setDescriptionModele(String descriptionModele) {
		this.descriptionModele = descriptionModele;
	}

	public int getPortes() {
		return portes;
	}

	public void setPortes(int portes) {
		this.portes = portes;
	}

	public int getPrixModele() {
		return prixModele;
	}

	public void setPrixModele(int prixModele) {
		this.prixModele = prixModele;
	}

}
