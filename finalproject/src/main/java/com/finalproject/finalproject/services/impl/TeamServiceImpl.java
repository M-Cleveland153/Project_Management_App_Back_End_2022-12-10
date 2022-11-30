package com.finalproject.finalproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.TeamRequestDto;
import com.finalproject.finalproject.model.TeamResponseDto;
import com.finalproject.finalproject.services.TeamService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{@Override
    public TeamResponseDto createTeam(TeamRequestDto teamRequestDto, CredentialsDto credentialsDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<TeamResponseDto> getAllTeams(Long companyId) {
        // TODO Auto-generated method stub
        return null;
    }

}