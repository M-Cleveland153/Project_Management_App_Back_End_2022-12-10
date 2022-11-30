package com.finalproject.finalproject.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Getter
@Setter

public class BadRequestException extends RuntimeException {
	
	private static final long serialVersionUID = -7081914445338196566L;
	
	private String message;

}
