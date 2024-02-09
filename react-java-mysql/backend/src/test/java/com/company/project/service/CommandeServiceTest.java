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

	@Test
	void testCreerCommande() {
		Commande Commande = new Commande();
		service.creerCommande(Commande);
		verify(repository, times(1)).save(Commande);
	}

	@Test
	void testRecupererCommandeParId() {
		Commande Commande = new Commande();
		when(repository.findById(anyInt())).thenReturn(Optional.of(Commande));
		service.recupererCommandeParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testSupprimerCommande() {
		Commande Commande = new Commande();
		service.supprimerCommande(Commande);
		verify(repository, times(1)).delete(Commande);
	}
}
