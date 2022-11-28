package com.finalproject.finalproject.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Credentials {

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

}
