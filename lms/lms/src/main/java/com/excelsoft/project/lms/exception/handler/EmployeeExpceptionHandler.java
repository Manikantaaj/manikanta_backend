package com.excelsoft.project.lms.exception.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excelsoft.project.lms.exception.EmployeePrimaryException;

@RestControllerAdvice
public class EmployeeExpceptionHandler {

	@ExceptionHandler(EmployeePrimaryException.class)
	public ResponseEntity<String> employeePrimaryException(RuntimeException exe)
	{
		return ResponseEntity.ok(exe.getMessage());
	}
}
