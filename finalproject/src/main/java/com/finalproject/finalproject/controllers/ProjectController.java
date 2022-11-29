package com.finalproject.finalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.model.CompanyRequestDto;
import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.ProjectRequestDto;
import com.finalproject.finalproject.model.ProjectResponseDto;
import com.finalproject.finalproject.services.ProjectService;
import com.finalproject.finalproject.services.TeamService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {
private final ProjectService projectService;

@PostMapping("/create")
public ProjectResponseDto createProject(@RequestBody ProjectRequestDto projectRequestDto, CredentialsDto credentialsDto) {
	return projectService.createProject(projectRequestDto, credentialsDto);
}

@GetMapping( "/team/{teamId}")
public List<ProjectResponseDto> getProjectsByTeam(@PathVariable Long teamId){
	return projectService.getProjectByTeam(teamId);
}


//@GetMapping( "/company/{companyId}")
////public List<ProjectResponseDto> getProjectsByCompany(@PathVariable Long companyId){
//	return projectService.getProjectsByCompany(companyId);
//}

@PatchMapping("/{projectId}")
public ProjectResponseDto updateProject(@RequestBody ProjectRequestDto projectRequestDto, CredentialsDto credentialsDto , @PathVariable Long projectId ) {
	return projectService.updateProject(projectRequestDto, projectId, credentialsDto);
}

}
