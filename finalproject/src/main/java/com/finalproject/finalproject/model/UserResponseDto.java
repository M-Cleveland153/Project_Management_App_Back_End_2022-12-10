package com.finalproject.finalproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponseDto {

	private Long id;

	private String username;

//	private ProfileDto profile;

	private boolean active;

	private boolean admin;

	private String status;

//	private TeamResponseDto team;

	private CompanyResponseDto company;

}
