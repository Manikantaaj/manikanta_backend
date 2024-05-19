package com.excelsoft.project.lms.dto;

import com.excelsoft.project.lms.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDetailsDto {

	private Integer bankId;
	
	private String accountNo;
	private String bankName;
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
	private String employeeId;
}
