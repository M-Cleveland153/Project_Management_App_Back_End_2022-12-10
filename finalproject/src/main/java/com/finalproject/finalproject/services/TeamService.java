package com.finalproject.finalproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.model.TeamRequestDto;
import com.finalproject.finalproject.model.TeamResponseDto;

@Service

public interface TeamService {

	TeamResponseDto createTeam(TeamRequestDto teamRequestDto, Long companyId);

	List<TeamResponseDto> getAllTeams(Long companyId);

//	TeamResponseDto getTeamById(Long teamId);

}
