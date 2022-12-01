package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.model.NewUserDto;
import com.finalproject.finalproject.model.UserRequestDto;
import com.finalproject.finalproject.model.UserResponseDto;


public interface UserService {


	List<UserResponseDto> getUsersByCompany(Long companyId);

//	UserResponseDto updateUser(Long userId);

	UserResponseDto createUser(NewUserDto newUserDto, Long companyId);

	UserResponseDto getUserByUserId(Long userId);

}
