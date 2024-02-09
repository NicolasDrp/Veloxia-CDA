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

import com.company.project.entity.Modele;
import com.company.project.repository.ModeleRepository;

@ExtendWith(MockitoExtension.class)
public class ModeleServiceTest {

	@Mock
	ModeleRepository repository;

	@InjectMocks
	ModeleService service;

	Modele Modele = new Modele();
	
	@Test
	void testCreerModele() {
		service.creerModele(Modele);
		verify(repository, times(1)).save(Modele);
	}

	@Test
	void testRecupererModeleParId() {
		when(repository.findById(anyInt())).thenReturn(Optional.of(Modele));
		service.recupererModeleParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testRecupererModeles() {
		service.recupererModeles();
		verify(repository, times(1)).findAll();
	}

	@Test
	void testSupprimerModele() {
		service.supprimerModele(Modele);
		verify(repository, times(1)).delete(Modele);
	}
}
