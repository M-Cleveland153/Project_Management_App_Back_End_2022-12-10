package com.finalproject.finalproject.model;

import java.util.List;

import com.finalproject.finalproject.entities.Company;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeamRequestDto {

	private String name;

	private String description;

	private Company company;

	private List<UserRequestDto> users;

}
