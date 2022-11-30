package com.finalproject.finalproject.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Getter
@Setter
public class NotAuthorizedException extends RuntimeException{

	private static final long serialVersionUID = -5176856022996798266L;
	private String message;

}
