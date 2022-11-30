package com.finalproject.finalproject.model;

import java.util.List;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeamResponseDto {

	private Long teamId;

	private String name;

	private String decription;

	private CompanyResponseDto company;

	private List<UserResponseDto> users;

}
