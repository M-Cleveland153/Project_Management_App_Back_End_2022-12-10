package com.finalproject.finalproject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue
	private Long userId;

	@Embedded
	private Credentials credentials;

	@Column(nullable = false)
	private String first;

	@Column(nullable = false)
	private String last;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String phone;

	private boolean active;

	private boolean admin;

	private String status;

	@ManyToOne
	private Team team;

	@ManyToOne
	private Company company;

	@OneToMany(mappedBy = "author")
	private List<Announcements> announcements;
}