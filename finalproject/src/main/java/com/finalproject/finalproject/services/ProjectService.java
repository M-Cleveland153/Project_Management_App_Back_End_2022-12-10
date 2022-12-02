package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.NewProjectDto;
import com.finalproject.finalproject.model.ProjectResponseDto;

public interface ProjectService {

//	ProjectResponseDto createProject(ProjectRequestDto projectRequestDto, CredentialsDto credentialsDto);

	ProjectResponseDto updateProject(NewProjectDto newProjectDto, Long id);

	List<ProjectResponseDto> getAllProjectsByTeam(Long id);

	ProjectResponseDto createProject(NewProjectDto newProjectDto);

//	ProjectResponseDto createProject(ProjectRequestDto projectRequestDto, CredentialsDto credentialsDto);

//	List<ProjectResponseDto> getProjectByTeam(Long teamId);

//	List<ProjectResponseDto> getProjectsByCompany(Long companyId);

//	ProjectResponseDto updateProject(ProjectRequestDto projectRequestDto, Long projectId,
//			CredentialsDto credentialsDto);
//
//	List<ProjectResponseDto> getAllProjects();

}
