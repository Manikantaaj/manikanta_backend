package com.excelsoft.project.lms.dto;

import java.time.LocalDate;

import com.excelsoft.project.lms.enums.Designation;

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
public class ExperienceDto {

	private Integer experienceId;
	
	private String companyName;
	private String yearOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	private Designation designation;
	private String location;
	private String employeeId;
}
