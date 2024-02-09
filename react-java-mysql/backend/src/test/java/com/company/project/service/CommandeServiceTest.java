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

import com.company.project.entity.Commande;
import com.company.project.repository.CommandeRepository;

@ExtendWith(MockitoExtension.class)
public class CommandeServiceTest {

	@Mock
	CommandeRepository repository;

	@InjectMocks
	CommandeService service;
	
	Commande commande = new Commande();

	@Test
	void testCreerCommande() {
		service.creerCommande(commande);
		verify(repository, times(1)).save(commande);
	}

	@Test
	void testRecupererCommandeParId() {
		when(repository.findById(anyInt())).thenReturn(Optional.of(commande));
		service.recupererCommandeParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testSupprimerCommande() {
		service.supprimerCommande(commande);
		verify(repository, times(1)).delete(commande);
	}
}
