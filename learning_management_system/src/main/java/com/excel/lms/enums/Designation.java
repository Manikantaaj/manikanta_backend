package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Designation {

	TRAINEE("TRAINEE"), MENTOR("MENTOR"), DEVELOPER("DEVELOPER"), TESTER("TESTER"), OTHER("OTHER");
	
	private final String designationType;
}
