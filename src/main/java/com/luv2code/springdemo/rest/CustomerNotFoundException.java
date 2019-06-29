package com.luv2code.springdemo.rest;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CustomerNotFoundException(String arg0) {
		super(arg0);
	}

	public CustomerNotFoundException(Throwable arg0) {
		super(arg0);
	}

	
}
