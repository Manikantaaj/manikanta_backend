package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Designation {

	TRAINEE, MENTOR, DEVELOPER, TESTER, OTHER;
	
	private String designationType;
}
