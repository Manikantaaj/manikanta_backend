package com.excel.demo.util;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public class EmployeeUtils {
	
	private EmployeeUtils()
	{
		
	}

	public static EmployeeDto entityToDto(Employee employee)
	{
		return EmployeeDto.builder().id(employee.getId())
				.firstName(employee.getFirstName())
			.lastName(employee.getLastName())
			.mobileNo(employee.getMobileNo())
			.aadharNo(employee.getAadharNo())
			.panNo(employee.getPanNo())
			.employeeNo(employee.getEmployeeNo()).build();
	}
	
	
	public static Employee updateValues(Employee employee, EmployeeDto dto)
	{
		employee.setFirstName(dto.getFirstName());
		employee.setLastName(dto.getLastName());
		employee.setMobileNo(dto.getMobileNo());
		return employee;
		
	}
	
}
