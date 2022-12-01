package com.finalproject.finalproject.model;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectResponseDto {

	private Long id;

	private String name;

	private String description;

	private Timestamp postedTime;

	private boolean active;

	private TeamResponseDto team;

}
