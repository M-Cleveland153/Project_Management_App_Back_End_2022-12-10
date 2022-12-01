package com.finalproject.finalproject.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CompanyResponseDto {

	private Long id;

	private String name;

	private String description;

	// private List<UserResponseDto> users;

	// private List<Team> teams;

	// private List<Announcements> announcements;

}
