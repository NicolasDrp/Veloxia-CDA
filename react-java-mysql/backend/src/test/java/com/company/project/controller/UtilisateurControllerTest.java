package com.company.project.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.company.project.controllers.UtilisateurController;
import com.company.project.entity.Utilisateur;
import com.company.project.service.UtilisateurService;

@ExtendWith(MockitoExtension.class)
public class UtilisateurControllerTest {

	@Mock
	UtilisateurService service;

	@InjectMocks
	UtilisateurController controller;

	Utilisateur utilisateur = new Utilisateur();

	@Test
	public void recupererUtilisateursTest() {
		List<Utilisateur> liste = new ArrayList<>();
		when(controller.recupererUtilisateurs()).thenReturn(liste);
		assertEquals(controller.recupererUtilisateurs(), liste);
		verify(service, times(1)).recupererUtilisateurs();
	}

	@Test
	public void recupererUtilisateurParIdTest() {
		int id = 1;
		when(service.recupererUtilisateurParId(id)).thenReturn(utilisateur);
		assertEquals(controller.recupererUtilisateurParId(id), utilisateur);
		verify(service, times(1)).recupererUtilisateurParId(id);
	}

	@Test
	public void creerUtilisateurTest() {
		when(service.creerUtilisateur(utilisateur)).thenReturn(utilisateur);
		assertEquals(controller.creerUtilisateur(utilisateur), utilisateur);
		verify(service, times(1)).creerUtilisateur(utilisateur);
	}

	@Test
	public void supprimerUtilisateurTest() {
		controller.supprimerUtilisateur(utilisateur);
		verify(service, times(1)).supprimerUtilisateur(utilisateur);
	}
}
