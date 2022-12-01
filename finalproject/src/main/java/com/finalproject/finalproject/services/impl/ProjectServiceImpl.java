package com.finalproject.finalproject.services.impl;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.ProjectRequestDto;
import com.finalproject.finalproject.model.ProjectResponseDto;
import com.finalproject.finalproject.services.ProjectService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{@Override
    public ProjectResponseDto createProject(ProjectRequestDto projectRequestDto, CredentialsDto credentialsDto) {
        // TODO Auto-generated method stub
        return null;
    }

//    @Override
//    public List<ProjectResponseDto> getProjectByTeam(Long teamId) {
//        // TODO Auto-generated method stub
//        return null;
//    }

    @Override
    public ProjectResponseDto updateProject(ProjectRequestDto projectRequestDto, Long projectId,
            CredentialsDto credentialsDto) {
        // TODO Auto-generated method stub
        return null;
    }

}
