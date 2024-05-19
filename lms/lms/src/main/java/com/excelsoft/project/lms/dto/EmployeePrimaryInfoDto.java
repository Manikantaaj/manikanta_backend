package com.excelsoft.project.lms.dto;

import java.time.LocalDate;

import com.excelsoft.project.lms.enums.Designation;
import com.excelsoft.project.lms.enums.EmployeeStatus;
import com.excelsoft.project.lms.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeePrimaryInfoDto {

	private Integer primaryId;
	
	private String employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private LocalDate dateOfBirth;
	private String email;
	private String bloodGroup;
	private Designation designation;
	private Gender gender;
	private String nationality;
	private EmployeeStatus employeeStatus;
}
