package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.TeamRequestDto;
import com.finalproject.finalproject.model.TeamResponseDto;

public interface TeamService {

	TeamResponseDto createTeam(TeamRequestDto teamRequestDto, CredentialsDto credentialsDto);

	List<TeamResponseDto> getAllTeams(Long companyId);

//	TeamResponseDto getTeamById(Long teamId);

}
