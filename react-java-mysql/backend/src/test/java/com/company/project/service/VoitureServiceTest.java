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

import com.company.project.entity.Voiture;
import com.company.project.repository.VoitureRepository;

@ExtendWith(MockitoExtension.class)
public class VoitureServiceTest {

	@Mock
	VoitureRepository repository;

	@InjectMocks
	VoitureService service;

	Voiture voiture = new Voiture();
	
	@Test
	void testCreerVoiture() {
		service.creerVoiture(voiture);
		verify(repository, times(1)).save(voiture);
	}

	@Test
	void testRecupererVoitureParId() {
		when(repository.findById(anyInt())).thenReturn(Optional.of(voiture));
		service.recupererVoitureParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testSupprimerVoiture() {
		service.supprimerVoiture(voiture);
		verify(repository, times(1)).delete(voiture);
	}
}
