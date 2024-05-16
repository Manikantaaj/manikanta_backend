package com.excel.demo.service;

import java.util.List;
import java.util.Optional;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public interface EmployeeService {

	public EmployeeDto addEmployee(EmployeeDto dto);
	
	public EmployeeDto getEmployee(Integer id);
	
	public List<EmployeeDto> getAllEmployee();

	public void deleteEmployee(Integer integer);

	public EmployeeDto updateEmployee(EmployeeDto dto);


	
}
