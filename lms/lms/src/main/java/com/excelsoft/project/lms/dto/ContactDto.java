package com.excelsoft.project.lms.dto;

import com.excelsoft.project.lms.enums.ContactType;

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
public class ContactDto {

	private Integer contactId;
	
	private ContactType contactType;
	private String contactNumber;
	private String employeeId;
}
