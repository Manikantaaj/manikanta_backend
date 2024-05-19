package com.excelsoft.project.lms.dto;


import com.excelsoft.project.lms.enums.EducationType;

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
public class EducationDetailDto {

	private Integer educationId;
	
	private EducationType educationType;
	private String yearOfPassing;
	private String percentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String state;
	private String employeeId;

}
