package com.finalproject.finalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.Announcements;

public interface AnnouncementRepository extends JpaRepository<Announcements, Long> {

}
