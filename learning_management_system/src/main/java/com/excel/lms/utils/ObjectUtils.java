package com.excel.lms.utils;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.entity.EmployeePrimaryInfo;

public class ObjectUtils {

	private ObjectUtils()
	{
		
	}
	
	public static EmployeePrimaryInfoDto primaryInfoDto(EmployeePrimaryInfo primaryInfo)
	{
		return EmployeePrimaryInfoDto.builder().employeeId(primaryInfo.getEmployeeId())
			.employeeName(primaryInfo.getEmployeeName()).dateOfJoining(primaryInfo.getDateOfJoining())
			.dateOfBirth(primaryInfo.getDateOfBirth()).designation(primaryInfo.getDesignation())
			.bloodGroup(primaryInfo.getBloodGroup()).email(primaryInfo.getEmail()).employeeStatus(primaryInfo.getEmployeeStatus())
			.gender(primaryInfo.getGender()).nationality(primaryInfo.getNationality()).build();
		
	}

	
}
