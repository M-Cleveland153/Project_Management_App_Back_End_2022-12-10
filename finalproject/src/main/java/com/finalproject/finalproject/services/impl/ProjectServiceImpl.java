package com.finalproject.finalproject.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.entities.Project;
import com.finalproject.finalproject.entities.Team;
import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.exceptions.BadRequestException;
import com.finalproject.finalproject.exceptions.NotFoundException;
import com.finalproject.finalproject.mappers.ProjectMapper;
import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.ProjectRequestDto;
import com.finalproject.finalproject.model.ProjectResponseDto;
import com.finalproject.finalproject.repositories.ProjectRepository;
import com.finalproject.finalproject.repositories.TeamRepository;
import com.finalproject.finalproject.repositories.UserRepository;
import com.finalproject.finalproject.services.ProjectService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

	private final ProjectMapper projectMapper;
	private final ProjectRepository projectRepository;
	private final TeamRepository teamRepository;
	private final UserRepository userRepository;


	@Override
	public List<ProjectResponseDto> getAllProjectsByTeam(Long id) {
		// TODO Auto-generated method stub
		List<Project> teamProjects = projectRepository.findAll();

		List<Project> projects = new ArrayList<>();
		for (Project a : teamProjects) {
			if (a.getTeam().getId().equals(id)) {
				projects.add(a);
			}
		}
		return projectMapper.entitiesToDtos(projects);
	}

	@Override
	public ProjectResponseDto createProject(ProjectRequestDto projectRequestDto, Long id) {
//		Project newProject = projectMapper.dtoToEntity(projectRequestDto);
//		if (newProject.getName() == null || newProject.getDescription() == null) {
//			throw new BadRequestException("Projects require name and description");
//		}
//
//		newProject = projectRepository.createProject(newProject);
//		return newProject;

		if (projectRequestDto.getTeam().getId() == null) {
			throw new NotFoundException("No projects found");
		}
		Project projectToCreate = projectMapper.dtoToEntity(projectRequestDto);
		
		Optional<User> userCreatingProject = userRepository.findById(id);

		if (userCreatingProject.get().isAdmin() != true) {
			throw new BadRequestException("Not authorized to create a project");
		}

		Optional<Team> teamOptional = teamRepository.findById(projectToCreate.getTeam().getId());

		projectToCreate.setTeam(teamOptional.get());

		return projectMapper.entityToDto(projectToCreate);

	}

	@Override
	public ProjectResponseDto updateProject(ProjectRequestDto projectRequestDto, Long projectId,
			CredentialsDto credentialsDto) {
//
//		Project projectUpdate = projectRepository.findById(projectId);
//
//		projectUpdate.setName(projectRequestDto.getName());
//
//		projectUpdate.setDescription(projectRequestDto.getDescription());
//
//		return projectMapper.entityToDto(projectRepository.saveAndFlush(projectUpdate));
		return null;

	}

}