package com.finalproject.finalproject.mappers;

import org.mapstruct.Mapper;

import com.finalproject.finalproject.entities.Credentials;
import com.finalproject.finalproject.model.CredentialsDto;

@Mapper(componentModel = "spring")
public interface CredentialsMapper {

	Credentials dtoToEntity(CredentialsDto credentialsDto);
}
