package com.finalproject.finalproject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Company {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@OneToMany(mappedBy = "company")
	private List<User> users;

	@OneToMany(mappedBy = "company")
	private List<Team> teams;

	// @OneToMany(mappedBy = "company")
	// private List<Announcements> announcements;

}
