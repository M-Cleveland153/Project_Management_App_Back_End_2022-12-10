package com.finalproject.finalproject.model;

import java.sql.Timestamp;

import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnnouncementsRequestDto {
	
	private Long id;

	private Timestamp postedTime;

	private String title;

	private String message;

	private Company company;

	private User author;

}
