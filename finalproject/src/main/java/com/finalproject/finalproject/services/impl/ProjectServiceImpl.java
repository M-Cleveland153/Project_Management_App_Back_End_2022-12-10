package com.finalproject.finalproject.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.entities.Project;
import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.exceptions.BadRequestException;
import com.finalproject.finalproject.exceptions.NotAuthorizedException;
import com.finalproject.finalproject.exceptions.NotFoundException;
import com.finalproject.finalproject.mappers.CredentialsMapper;
import com.finalproject.finalproject.mappers.ProjectMapper;
import com.finalproject.finalproject.model.NewProjectDto;
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
	private final CredentialsMapper credentialsMapper;

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
	public ProjectResponseDto createProject(NewProjectDto newProjectDto) {

		User authorizingUser = userRepository
				.findByCredentials(credentialsMapper.dtoToEntity(newProjectDto.getCredentialsDto()));
		Project newProject = projectMapper.dtoToEntity(newProjectDto.getProjectRequestDto());

//		Project newProject = projectMapper.dtoToEntity(projectRequestDto);
//		if (newProject.getName() == null || newProject.getDescription() == null) {
//			throw new BadRequestException("Projects require name and description");
//		}
//
//		newProject = projectRepository.createProject(newProject);
//		return newProject;

		// if (projectRequestDto.getTeam().getId() == null) {
		// throw new NotFoundException("No projects found");
		// }

		if (authorizingUser == null)
			throw new BadRequestException("Bad request, incorrect user details.");
		if (authorizingUser.isAdmin() == false)
			throw new NotAuthorizedException("Not authorized to create a project");

		// Team teamOptional =
		// teamRepository.findById(projectToCreate.getTeam().getId()).get();

		// projectToCreate.setTeam(teamOptional);

		return projectMapper.entityToDto(projectRepository.saveAndFlush(newProject));
	}

	@Override
	public ProjectResponseDto updateProject(NewProjectDto newProjectDto, Long id) {

//		Project projectUpdate = projectRepository.findById(projectId);
//
//		projectUpdate.setName(projectRequestDto.getName());
//
//		projectUpdate.setDescription(projectRequestDto.getDescription());
//
//		return projectMapper.entityToDto(projectRepository.saveAndFlush(projectUpdate));

		User authorizingUser = userRepository
				.findByCredentials(credentialsMapper.dtoToEntity(newProjectDto.getCredentialsDto()));

		Project projectFromRepo = projectRepository.findById(id).get();

		Project projectToUpdate = projectMapper.dtoToEntity(newProjectDto.getProjectRequestDto());

		if (newProjectDto.getProjectRequestDto().getTeam().getId() == null) {
			throw new NotFoundException("No projects found");
		}

		if (authorizingUser.isAdmin() != true) {
			throw new BadRequestException("Not authorized to create a project");
		}

		projectFromRepo.setName(projectToUpdate.getName());
		projectFromRepo.setTeam(projectToUpdate.getTeam());
		projectFromRepo.setDescription(projectToUpdate.getDescription());
		projectFromRepo.setActive(projectToUpdate.isActive());

		return projectMapper.entityToDto(projectRepository.saveAndFlush(projectFromRepo));

	}

}