package com.company.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.company.project.entity.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Integer> {
}
