package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AccountType {

	SAVING("SAVING"), CURRENT("CURRENT"), SALARY("SALARY");
	
	private final String accountType;
}
