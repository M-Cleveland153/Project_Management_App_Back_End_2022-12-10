package com.finalproject.finalproject.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 380723677025587713L;
	private String message;
}
