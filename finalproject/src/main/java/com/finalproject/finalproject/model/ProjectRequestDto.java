package com.finalproject.finalproject.model;

import java.sql.Timestamp;

import com.finalproject.finalproject.entities.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectRequestDto {

	private String name;

	private String description;

	private Timestamp editedTime;

	private boolean active;

	private Team team;

}
