package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.CompanyResponseDto;
import com.finalproject.finalproject.model.CredentialsDto;


public interface CompanyService {

	CompanyResponseDto getCompanyById(Long companyId, CredentialsDto credentialsDto);

	List<CompanyResponseDto> getAllCompanies(CredentialsDto credentialsDto);

}
