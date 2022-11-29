package com.finalproject.finalproject.model;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnnouncementsRequestDto {
	
	private Long id;

	private Timestamp postedTime;

	private String title;

	private String message;

	private Long company;

	private String author;

}
