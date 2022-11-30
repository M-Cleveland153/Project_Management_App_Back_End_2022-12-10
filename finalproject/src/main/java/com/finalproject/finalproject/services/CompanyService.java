package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.CompanyResponseDto;


public interface CompanyService {

	CompanyResponseDto getCompanyById(Long companyId);

	List<CompanyResponseDto> getAllCompanies();

}
