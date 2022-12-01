package com.finalproject.finalproject.model;

import java.util.List;

import com.finalproject.finalproject.entities.Announcements;
import com.finalproject.finalproject.entities.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompanyResponseDto {

	private Long id;

	private String name;

	private String description;

	// private List<UserResponseDto> users;

	// private List<Team> teams;

	// private List<Announcements> announcements;

}
