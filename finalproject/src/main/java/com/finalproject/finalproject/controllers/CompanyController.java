package com.finalproject.finalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.model.CompanyResponseDto;
import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.services.CompanyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

	private final CompanyService companyService;
	
	@GetMapping("/{companyId}")
	public CompanyResponseDto getCompanyById(@PathVariable Long companyId, @RequestBody CredentialsDto credentialsDto) {
		return companyService.getCompanyById(companyId, credentialsDto);
	}
	
	@GetMapping
	public List<CompanyResponseDto> getAllCompanies(@RequestBody CredentialsDto credentialsDto){
		return companyService.getAllCompanies(credentialsDto);
	}
}
