package com.finalproject.finalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
