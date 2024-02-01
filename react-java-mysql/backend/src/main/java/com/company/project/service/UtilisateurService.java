package com.company.project.service;


import com.company.project.entity.Utilisateur;
import com.company.project.repository.UtilisateurRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	@Autowired
	public UtilisateurService(UtilisateurRepository utilisateurRepository) {
		this.utilisateurRepository = utilisateurRepository;
	}

	public Utilisateur creerUtilisateur(Utilisateur utilisateur) {
		utilisateurRepository.save(utilisateur);
		return utilisateur;
	}

	public Utilisateur recupererUtilisateurParId(int id) {
		return utilisateurRepository.findById(id).orElse(null);
	}
	
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	public void supprimerUtilisateur(Utilisateur utilisateur) {
		utilisateurRepository.delete(utilisateur);
	}
}
