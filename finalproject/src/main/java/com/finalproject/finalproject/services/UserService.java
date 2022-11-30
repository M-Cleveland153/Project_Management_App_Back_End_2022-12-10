package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.UserRequestDto;
import com.finalproject.finalproject.model.UserResponseDto;


public interface UserService {

	UserResponseDto createUser(UserRequestDto userRequestDto);

	List<UserResponseDto> getUsersByCompany(Long companyId);

	UserResponseDto getUserByUserId(long userId);

	UserResponseDto updateUser(long userId);

}
