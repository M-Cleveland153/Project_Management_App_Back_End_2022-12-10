package com.finalproject.finalproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Project {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	private boolean active;

	@ManyToOne
	private Team team;

}
