package com.excel.demo.exception;

public class EmployeeNotFoundException extends RuntimeException{

	public static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundException(String message)
	{
		super(message);
	}
}
