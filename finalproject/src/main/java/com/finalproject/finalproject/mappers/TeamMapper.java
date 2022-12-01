package com.finalproject.finalproject.mappers;

import java.util.List;

import com.finalproject.finalproject.entities.Team;
import com.finalproject.finalproject.model.TeamRequestDto;
import com.finalproject.finalproject.model.TeamResponseDto;

public interface TeamMapper {

	Team dtoToEntity(TeamRequestDto teamRequestDto);

	TeamResponseDto entityToDto(Team saveAndFlush);

	List<TeamResponseDto> entitiesToDtos(List<Team> collect);

//	List<TeamResponseDto> entitiesToDtos(List<Team> teams);

//	Team dtoToEntity(TeamRequestDto teamRequestDto);
//
//	TeamResponseDto entityToDto(Team team);
//
//	List<TeamResponseDto> entitiesToDtos(List<Team> collect);

	



}
