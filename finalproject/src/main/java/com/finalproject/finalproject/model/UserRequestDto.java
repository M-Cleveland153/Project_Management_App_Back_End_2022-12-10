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

	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	private Boolean active;

	private Boolean admin;

	private String status;

	private Team team;

	private Company company;

}
