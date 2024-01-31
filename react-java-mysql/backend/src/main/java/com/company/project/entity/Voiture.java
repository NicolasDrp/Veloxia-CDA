package com.company.project.entity;

import com.company.project.service.fabrique.Vehicule;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Voiture")
public class Voiture implements Vehicule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_voiture", nullable = false)
    private Long idVoiture;

    @Column(name = "couleur_voiture", nullable = false)
    private String couleurVoiture;

    @Column(name = "nom_utilisateur", nullable = false)
    private String nomUtilisateur;

    @ManyToOne
    @JoinColumn(name = "id_modele", nullable = false)
    private Modele modele;

    public Voiture() {
        super();
    }

    public Long getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(Long idVoiture) {
        this.idVoiture = idVoiture;
    }

    public String getCouleurVoiture() {
        return couleurVoiture;
    }

    public void setCouleurVoiture(String couleurVoiture) {
        this.couleurVoiture = couleurVoiture;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

}
