package com.finalproject.finalproject.mappers;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.model.UserRequestDto;
import com.finalproject.finalproject.model.UserResponseDto;

@Mapper(componentModel = "spring", uses = {CredentialsMapper.class, ProfileMapper.class})
public interface UserMapper {

	@Mapping(target="username", source = "credentials.username")
	UserResponseDto entityToDto (User user);
	
	List<UserResponseDto> entitiesToDtos(List<User> users);
	
	User dtoToEntity(UserRequestDto userRequestDto);
	
}
