package com.finalproject.finalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.model.CompanyResponseDto;
import com.finalproject.finalproject.services.CompanyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

	private final CompanyService companyService;
	
	@GetMapping("/{companyId}")
	public CompanyResponseDto getCompanyById(@PathVariable Long companyId) {
		return companyService.getCompanyById(companyId);
	}
	
	@GetMapping
	public List<CompanyResponseDto> getAllCompanies(){
		return companyService.getAllCompanies();
	}
}
