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

	Notification notification = new Notification();

	@Test
	public void majTest() {
	}

	@Test
	void testCreerNotification() {
		service.creerNotification(notification);
		verify(repository, times(1)).save(notification);
	}

	@Test
	void testRecupererNotificationParId() {
		when(repository.findById(anyInt())).thenReturn(Optional.of(notification));
		service.recupererNotificationParId(1);
		verify(repository, times(1)).findById(1);
	}

	@Test
	void testSupprimerNotification() {
		service.supprimerNotification(notification);
		verify(repository, times(1)).delete(notification);
	}
}
