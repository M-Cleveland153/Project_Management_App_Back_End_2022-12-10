package com.finalproject.finalproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponseDto {

	private Long userId;

	private String first;

	private String last;

	private boolean active;

	private boolean admin;

	private String status;

	private TeamResponseDto team;

	private CompanyResponseDto company;

}
