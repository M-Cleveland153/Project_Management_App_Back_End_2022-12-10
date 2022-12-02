package com.finalproject.finalproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.finalproject.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	

//	Project createProject(Project newProject);
//
//	List<Project> findAll(Long companyId);

}
