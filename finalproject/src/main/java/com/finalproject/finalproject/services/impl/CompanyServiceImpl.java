package com.finalproject.finalproject.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.exceptions.BadRequestException;
import com.finalproject.finalproject.exceptions.NotAuthorizedException;
import com.finalproject.finalproject.mappers.CompanyMapper;
import com.finalproject.finalproject.mappers.CredentialsMapper;
import com.finalproject.finalproject.model.CompanyResponseDto;
import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.repositories.CompanyRepository;
import com.finalproject.finalproject.repositories.UserRepository;
import com.finalproject.finalproject.services.CompanyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService{

    private final CompanyMapper companyMapper;
    private final CredentialsMapper credentialsMapper;

    private final CompanyRepository companyRepository;
    private final UserRepository userRepository;

    public CompanyResponseDto getCompanyById(Long companyId, CredentialsDto credentialsDto) {
        // Checks credentials to see if loggedUser exists
        User loggedUser = userRepository.findByCredentials(credentialsMapper.dtoToEntity(credentialsDto));
        if (loggedUser == null) throw new NotAuthorizedException("Incorrect login details or user does not exist.");

        // Get the selected company if it exists, and if the user has access to that company
        Company selectedCompany = companyRepository.findById(companyId).get();

        // if (selectedCompany == null) throw new BadRequestException("Company ID: " + companyId + " does not exist.");
        // if (!selectedCompany.get().getUsers().contains(loggedUser.get())) throw new NotAuthorizedException("You do not have access to that company.");

        System.out.println(companyMapper.entityToDto(selectedCompany));

        return companyMapper.entityToDto(selectedCompany);
    }

    public List<CompanyResponseDto> getAllCompanies(CredentialsDto credentialsDto) {
        // Checks credentials to see if loggedUser exists
        User loggedUser = userRepository.findByCredentials(credentialsMapper.dtoToEntity(credentialsDto));
        if (loggedUser == null) throw new NotAuthorizedException("Incorrect login details or user does not exist.");
        
        // Gets all companies that the user has access to
        List<Company> selectedCompanies = companyRepository.findByUsers(loggedUser);
        if (selectedCompanies == null || selectedCompanies.isEmpty()) 
            throw new BadRequestException("You do not have access to any companies. Please contact your administrator for assistance.");

        return companyMapper.entitiesToDtos(selectedCompanies);
    }

}