package com.excelsoft.project.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AddressType {

	PERAMANENT("PERAMANENT"), CURRENT("CURRENT");

	private final String addressType;
}
