package com.company.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Concessionnaire")
public class Concessionnaire {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_concessionnaire",nullable = false)
    private Long idConcessionnaire;
	
	@Column(name =  "nom_concessionnaire",nullable = false)
	private String nomConcessionnaire;
	
	@Column(name =  "numero_rue",nullable = false)
	private int numeroRue;
	
	@Column(name =  "rue",nullable = false)
	private String rue;
	
	@Column(name =  "ville",nullable = false)
	private String ville;
	
	@Column(name =  "code_postal",nullable = false)
	private int codePostal;
	
	@Column(name =  "pays",nullable = false)
	private String pays;

	public Concessionnaire() {
		super();
	}

	public Long getIdConcessionnaire() {
		return idConcessionnaire;
	}

	public void setIdConcessionnaire(Long idConcessionnaire) {
		this.idConcessionnaire = idConcessionnaire;
	}

	public String getNomConcessionnaire() {
		return nomConcessionnaire;
	}

	public void setNomConcessionnaire(String nomConcessionnaire) {
		this.nomConcessionnaire = nomConcessionnaire;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}
