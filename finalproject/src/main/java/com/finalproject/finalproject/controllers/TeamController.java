package com.finalproject.finalproject.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.model.TeamRequestDto;
import com.finalproject.finalproject.model.TeamResponseDto;
import com.finalproject.finalproject.services.TeamService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{companyId}/team")
public class TeamController {

	private final TeamService teamService;

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.OK)
	public TeamResponseDto createTeam(@RequestBody TeamRequestDto teamRequestDto, @PathVariable Long companyId) {
		return teamService.createTeam(teamRequestDto, companyId);
	}
	
	@GetMapping
	public List<TeamResponseDto> getAllTeams(@PathVariable Long companyId){
		return teamService.getAllTeams(companyId);
	}
	
//	@GetMapping
//	public TeamResponseDto getTeamById(@PathVariable Long teamId) {
//		return teamService.getTeamById(teamId);
//	}
	
	
	
}


