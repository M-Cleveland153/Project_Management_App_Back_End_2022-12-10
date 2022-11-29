package com.finalproject.finalproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.services.ValidateService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@RequestMapping("/validate")


public class ValidateController {
	
	private final ValidateService validateService;

	@GetMapping("/username/exists/{username}")
	public boolean existUsername(@PathVariable String username) {
		return validateService.existUsername(username);
	}

	@GetMapping("/username/available/{username}")
	public boolean availableUsername(@PathVariable String username) {
		return !validateService.existUsername(username);
	}
//
//	@GetMapping("/tag/exists/{label}")
//	public Boolean team(@PathVariable String label) {
//		return validateService.team(label);
//	}

}
