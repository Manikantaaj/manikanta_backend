package com.excelsoft.project.lms.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EducationDetailDtoList {

	private String employeeId;
	
	private List<EducationDetailDto> education;

}
