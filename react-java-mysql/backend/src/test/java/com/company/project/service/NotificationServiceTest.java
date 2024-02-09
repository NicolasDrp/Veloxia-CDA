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

import com.company.project.entity.Notification;
import com.company.project.repository.NotificationRepository;

@ExtendWith(MockitoExtension.class)
public class NotificationServiceTest {

	@Mock
	NotificationRepository repository;

	@InjectMocks
	NotificationService service;

	@Test
	public void majTest() {
		
	}

	@Test
	void testCreerNotification() {
		Notification Notification = new Notification();
		service.creerNotification(Notification);
		verify(repository, times(1)).save(Notification);
	}

	@Test
	void testRecupererNotificationParId() {
		Notification Notification = new Notification();
		when(repository.findById(anyInt())).thenReturn(Optional.of(Notification));
		service.recupererNotificationParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testSupprimerNotification() {
		Notification Notification = new Notification();
		service.supprimerNotification(Notification);
		verify(repository, times(1)).delete(Notification);
	}
}
