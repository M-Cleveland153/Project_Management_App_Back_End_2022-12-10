package com.finalproject.finalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.model.NewProjectDto;
import com.finalproject.finalproject.model.ProjectResponseDto;
import com.finalproject.finalproject.services.ProjectService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {
	private final ProjectService projectService;

	@GetMapping("/{teamId}")
	public List<ProjectResponseDto> getAllProjectsByTeam(@PathVariable Long teamId) {
		return projectService.getAllProjectsByTeam(teamId);
	}

	@PostMapping("/create")
	public ProjectResponseDto createProject(@RequestBody NewProjectDto newProjectDto) {
		return projectService.createProject(newProjectDto);
	}

//@GetMapping( "/team/{teamId}")
//public List<ProjectResponseDto> getProjectsByTeam(@PathVariable Long teamId){
//	return projectService.getProjectByTeam(teamId);
//}

//@GetMapping( "/company/{companyId}")
////public List<ProjectResponseDto> getProjectsByCompany(@PathVariable Long companyId){
//	return projectService.getProjectsByCompany(companyId);x
//}

	@PatchMapping("/{projectId}")
	public ProjectResponseDto updateProject(@RequestBody NewProjectDto newProjectDto, @PathVariable Long projectId) {
		return projectService.updateProject(newProjectDto, projectId);
	}

}
