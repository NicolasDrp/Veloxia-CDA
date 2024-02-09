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

import com.company.project.entity.Concessionnaire;
import com.company.project.repository.ConcessionnaireRepository;

@ExtendWith(MockitoExtension.class)
public class ConcessionnaireServiceTest {

	@Mock
	ConcessionnaireRepository repository;

	@InjectMocks
	ConcessionnaireService service;

	@Test
	void testCreerConcessionnaire() {
		Concessionnaire concessionnaire = new Concessionnaire();
		service.creerConcessionnaire(concessionnaire);
		verify(repository, times(1)).save(concessionnaire);
	}

	@Test
	void testRecupererConcessionnaireParId() {
		Concessionnaire concessionnaire = new Concessionnaire();
		when(repository.findById(anyInt())).thenReturn(Optional.of(concessionnaire));
		service.recupererConcessionnaireParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testRecupererConcessionnaires() {
		service.recupererConcessionnaires();
		verify(repository, times(1)).findAll();
	}

	@Test
	void testSupprimerConcessionnaire() {
		Concessionnaire concessionnaire = new Concessionnaire();
		service.supprimerConcessionnaire(concessionnaire);
		verify(repository, times(1)).delete(concessionnaire);
	}
}
