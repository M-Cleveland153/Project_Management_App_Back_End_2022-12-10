package com.finalproject.finalproject.mappers;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.model.CompanyResponseDto;

@Mapper
public interface CompanyMapper {

    CompanyResponseDto entityToDto (Company company);
	
	List<CompanyResponseDto> entitiesToDtos(List<Company> companies);

}
