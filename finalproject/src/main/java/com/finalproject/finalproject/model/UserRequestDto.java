package com.finalproject.finalproject.model;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequestDto {

	private CredentialsDto credentials;

	private ProfileDto profile;

	private boolean active;

	private boolean admin;

	private String status;


}
