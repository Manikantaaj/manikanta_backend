package com.excel.demo.service;

import java.util.List;
import java.util.Optional;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public interface EmployeeService {

	public EmployeeDto addEmployee(EmployeeDto dto);

	public EmployeeDto getById(int id);

	public void deleteEmployee(EmployeeDto dto);

	public List<EmployeeDto> getAllEmployee();

	
}
