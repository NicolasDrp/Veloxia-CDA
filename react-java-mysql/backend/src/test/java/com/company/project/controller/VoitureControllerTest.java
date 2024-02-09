package com.company.project.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.company.project.controllers.VoitureController;
import com.company.project.entity.Voiture;
import com.company.project.service.VoitureService;

@ExtendWith(MockitoExtension.class)
public class VoitureControllerTest {

	@Mock
	VoitureService service;
	
	@InjectMocks
	VoitureController controller;
	
	Voiture voiture = new Voiture();
	
	@Test
	public void recupererVoitureParIdTest() {
		int id = 1;
		when(service.recupererVoitureParId(id)).thenReturn(voiture);
		assertEquals(controller.recupererVoitureParId(id), voiture);
		verify(service,times(1)).recupererVoitureParId(id);
	}
	
	@Test
	public void creerVoitureTest() {
		when(service.creerVoiture(voiture)).thenReturn(voiture);
		assertEquals(controller.creerVoiture(voiture), voiture);
		verify(service, times(1)).creerVoiture(voiture);
	}
	
	@Test
	public void supprimerVoitureTest() {
		controller.supprimerVoiture(voiture);
		verify(service, times(1)).supprimerVoiture(voiture);
	}
}
