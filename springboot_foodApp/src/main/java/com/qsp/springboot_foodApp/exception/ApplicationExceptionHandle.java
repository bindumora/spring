package com.qsp.springboot_foodApp.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandle {
	
	@ExceptionHandler
	public String UserIdNotFound(UserIdNotFound userIdNotFound) {
		return userIdNotFound.getMessage();
		
	}

	
}
