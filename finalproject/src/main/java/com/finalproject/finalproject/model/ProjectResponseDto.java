package com.finalproject.finalproject.model;

import java.sql.Timestamp;

import com.finalproject.finalproject.entities.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectResponseDto {

	private Long projectId;

	private String name;

	private String description;

	private Timestamp postedTime;

	private boolean active;

	private TeamResponseDto team;

}
