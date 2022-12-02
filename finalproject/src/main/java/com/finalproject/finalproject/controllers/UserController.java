package com.finalproject.finalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.model.NewUserDto;
import com.finalproject.finalproject.model.UserResponseDto;
import com.finalproject.finalproject.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{companyId}/users")

public class UserController {

	private final UserService userService;
	


	@PostMapping("/create")
	public UserResponseDto createUser(@RequestBody NewUserDto newUserDto, @PathVariable Long companyId) {
		return userService.createUser(newUserDto, companyId);
	}

	@GetMapping
	public List<UserResponseDto> getUsersByCompany(@PathVariable Long companyId) {
		return userService.getUsersByCompany(companyId);
	}

	@GetMapping("/{userId}")
	public UserResponseDto getUserByUserId(@PathVariable Long userId) {
		return userService.getUserByUserId(userId);
	}

//	@PatchMapping("/{userId}")
//	public UserResponseDto updateUser(@RequestBody UserRequestDto userRequestDto, @PathVariable Long userId) {
//		return userService.updateUser(userId);
//	}


}
