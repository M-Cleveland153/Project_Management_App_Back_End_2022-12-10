package com.finalproject.finalproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	private Long id;

	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String first;

	@Column(nullable = false)
	private String last;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String phone;

	private Boolean active;

	private Boolean admin;

	private String status;

	@ManyToOne
	private Company companyId;

	@ManyToOne
	private Team teamId;
}
