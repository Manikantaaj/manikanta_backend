package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EducationType {

	POST_GRADUATE, UNDER_GRADUATE, MASTER;
	
	private String employeeType;
}
