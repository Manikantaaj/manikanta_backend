package com.excelsoft.project.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EmployeeStatus {

	TERMINATED("TERMINATED"), ACTIVE("ACTIVE"), NOTICEPEROID("NOTICEPEROID");
	

	private final String employeeStatus;
}
