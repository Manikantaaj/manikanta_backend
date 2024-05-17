package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MaritalStatus {

	UNMARRIED, MARRIED, DIVORCED;
	
	private String maritalStatus;
}
