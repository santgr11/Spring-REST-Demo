package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {
	
	// add an exception handler for CustomerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException e) {
		
		// create CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse();
		error.setMessage(e.getMessage());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setTimeStamp(System.currentTimeMillis());
		
		// return ResponseEntity		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	// add exception handler for any exception
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception e) {
		
		// create CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse();
		error.setMessage(e.getMessage());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setTimeStamp(System.currentTimeMillis());
		
		// return ResponseEntity		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		
	}
	
}
