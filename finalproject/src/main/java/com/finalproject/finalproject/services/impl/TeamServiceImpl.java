package com.finalproject.finalproject.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.Team;
import com.finalproject.finalproject.exceptions.BadRequestException;
import com.finalproject.finalproject.exceptions.NotFoundException;
import com.finalproject.finalproject.mappers.TeamMapper;
import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.TeamRequestDto;
import com.finalproject.finalproject.model.TeamResponseDto;
import com.finalproject.finalproject.repositories.CompanyRepository;
import com.finalproject.finalproject.repositories.TeamRepository;
import com.finalproject.finalproject.services.TeamService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class TeamServiceImpl implements TeamService {

	private final TeamMapper teamMapper;
	private final TeamRepository teamRepository;
//	private final CredentialsMapper credentialsMapper;
//	private final UserRepository userRepository;
	private final CompanyRepository companyRepository;
//	private final ProjectRepository projectRepository;

	public TeamResponseDto createTeam(TeamRequestDto teamRequestDto, Long companyId) {
		Team newTeamToBeCreated = teamMapper.dtoToEntity(teamRequestDto);
		if (newTeamToBeCreated.getName() == null || 
			newTeamToBeCreated.getDescription() == null ||
			newTeamToBeCreated.getCompany() == null ||
			newTeamToBeCreated.getUsers().isEmpty())
			throw new BadRequestException("Description, Company, Name, or User is invalid");
		
		Optional <Company> incomingCompany = companyRepository.findById(companyId);
		
		if(incomingCompany == null)
			throw new NotFoundException("Company not found");
		
		for( Team team : incomingCompany.get().getTeams()) {
			if (team.getName() == newTeamToBeCreated.getName()) {
				throw new BadRequestException("Team name already exsists");
			}
		}
		

		return teamMapper.entityToDto(teamRepository.saveAndFlush(newTeamToBeCreated));
		


	}

	@Override
	public List<TeamResponseDto> getAllTeams(Long Id) {
		return teamMapper.entitiesToDtos(teamRepository.findAll().stream().collect(Collectors.toList()));

	}

}
