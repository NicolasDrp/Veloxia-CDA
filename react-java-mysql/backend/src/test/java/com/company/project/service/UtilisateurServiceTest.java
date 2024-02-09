package com.company.project.service;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.company.project.entity.Utilisateur;
import com.company.project.repository.UtilisateurRepository;

@ExtendWith(MockitoExtension.class)
public class UtilisateurServiceTest {

	@Mock
	UtilisateurRepository repository;

	@InjectMocks
	UtilisateurService service;

	Utilisateur utilisateur = new Utilisateur();
	
	@Test
	void testCreerUtilisateur() {
		service.creerUtilisateur(utilisateur);
		verify(repository, times(1)).save(utilisateur);
	}

	@Test
	void testRecupererUtilisateurParId() {
		when(repository.findById(anyInt())).thenReturn(Optional.of(utilisateur));
		service.recupererUtilisateurParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testRecupererUtilisateurs() {
		service.recupererUtilisateurs();
		verify(repository, times(1)).findAll();
	}

	@Test
	void testSupprimerUtilisateur() {
		service.supprimerUtilisateur(utilisateur);
		verify(repository, times(1)).delete(utilisateur);
	}
}
