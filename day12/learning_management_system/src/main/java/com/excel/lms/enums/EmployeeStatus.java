package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EmployeeStatus {

	TERMINATED, ACTIVE, NOTICEPEROID;
	
	private String employeeStatus;
}
