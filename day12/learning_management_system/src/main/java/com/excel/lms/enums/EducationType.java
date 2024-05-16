package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EducationType {

	POST_GRADUATE("POST-GRADUATE"), UNDER_GRADUATE("UNDER-GRADUATE"), MASTER("MASTER");
	
	private final String employeeType;
}
