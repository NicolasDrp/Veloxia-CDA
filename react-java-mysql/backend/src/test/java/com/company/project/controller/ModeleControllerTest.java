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

import com.company.project.controllers.ModeleController;
import com.company.project.entity.Modele;
import com.company.project.service.ModeleService;

@ExtendWith(MockitoExtension.class)
public class ModeleControllerTest {

	@Mock
	ModeleService service;

	@InjectMocks
	ModeleController controller;

	Modele modele = new Modele();

	@Test
	public void recupererModelesTest() {
		List<Modele> liste = new ArrayList<>();
		when(controller.recupererModeles()).thenReturn(liste);
		assertEquals(controller.recupererModeles(), liste);
		verify(service, times(1)).recupererModeles();
	}

	@Test
	public void recupererModeleParIdTest() {
		int id = 1;
		when(service.recupererModeleParId(id)).thenReturn(modele);
		assertEquals(controller.recupererModeleParId(id), modele);
		verify(service, times(1)).recupererModeleParId(id);
	}

	@Test
	public void creerModeleTest() {
		when(service.creerModele(modele)).thenReturn(modele);
		assertEquals(controller.creerModele(modele), modele);
		verify(service, times(1)).creerModele(modele);
	}

	@Test
	public void supprimerModeleTest() {
		controller.supprimerModele(modele);
		verify(service, times(1)).supprimerModele(modele);
	}
}
