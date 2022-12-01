package com.finalproject.finalproject.model;

import com.finalproject.finalproject.entities.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NewUserDto {

	CredentialsDto credentialsDto;

    UserRequestDto userRequestDto;

}
