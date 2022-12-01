package com.finalproject.finalproject.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Announcements {

	@Id
	@GeneratedValue
	private Long id;

	@CreationTimestamp
	@Column(nullable = false)
	private Timestamp postedTime;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String message;

	@ManyToOne
	private Company company;

	@ManyToOne
	private User author;

}