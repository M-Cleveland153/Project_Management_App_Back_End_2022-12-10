package com.finalproject.finalproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.finalproject.finalproject.entities.Announcements;
import com.finalproject.finalproject.entities.Project;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;
import com.finalproject.finalproject.model.ProjectRequestDto;
import com.finalproject.finalproject.model.ProjectResponseDto;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

//	public ProjectResponseDto createProject(@RequestBody ProjectRequestDto projectRequestDto);
//
//	public Project dtoToProject(ProjectRequestDto projectRequestDto);
//
//	public ProjectResponseDto entityToDto(Long teamId);
//
//	public Project dtoToEntity(ProjectRequestDto projectRequestDto);
//
//	public ProjectResponseDto entityToDto(Project saveAndFlush);
//
//	public Project getProjectByTeam(Optional<Project> project);
	
	List<ProjectResponseDto> entitiesToDtos(List<Project> project);

	Project dtoToEntity(ProjectRequestDto projectRequestDto);

	ProjectResponseDto entityToDto(Project saveAndFlush);

}