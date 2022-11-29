package com.finalproject.finalproject.model;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequestDto {

	private Long userId;

	private CredentialsDto credentials;

	private String first;

	private String last;

	private String email;

	private String phone;

	private boolean active;

	private boolean admin;

	private String status;

	private Team team;

	private Company company;

}
