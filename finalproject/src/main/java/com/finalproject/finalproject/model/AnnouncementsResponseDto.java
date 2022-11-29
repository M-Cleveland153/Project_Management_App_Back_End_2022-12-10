package com.finalproject.finalproject.model;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnnouncementsResponseDto {
	
	private Timestamp postedTime;

	private String title;

	private String message;
	
	private CompanyResponseDto company;

	private UserResponseDto author;

}
