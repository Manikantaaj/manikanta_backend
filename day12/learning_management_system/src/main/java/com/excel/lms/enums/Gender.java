package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Gender {

	MALE, FEMALE, OTHERS;
	
	private String genderType;
}
