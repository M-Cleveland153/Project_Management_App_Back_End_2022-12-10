package com.finalproject.finalproject.mappers;

import org.mapstruct.Mapper;

import com.finalproject.finalproject.model.ProfileDto;

@Mapper(componentModel = "spring", uses = CredentialsMapper.class)
public interface ProfileMapper {

	ProfileMapper dtoToProfile(ProfileDto profileDto);
}
