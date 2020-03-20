package com.mvc.springboot.rest.model;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(String exception) {
		super(exception);
	}
}
