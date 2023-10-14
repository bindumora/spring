package com.qsp.springboot_foodApp.exception;

public class UserIdNotFound extends RuntimeException{
	
	private String message="User Id Not Found";

	
	public String getMessage() {
		return message;
	}


	public UserIdNotFound() {
	}
	}
	


