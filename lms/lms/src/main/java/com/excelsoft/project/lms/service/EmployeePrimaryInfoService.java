package com.excelsoft.project.lms.service;

import com.excelsoft.project.lms.dto.AddressDetailList;
import com.excelsoft.project.lms.dto.BankDetailsDto;
import com.excelsoft.project.lms.dto.ContactListDto;
import com.excelsoft.project.lms.dto.EducationDetailDtoList;
import com.excelsoft.project.lms.dto.EmployeePrimaryInfoDto;
import com.excelsoft.project.lms.dto.EmployeeSecondaryInfoDto;
import com.excelsoft.project.lms.dto.ExperienceList;
import com.excelsoft.project.lms.entity.EmployeeSecondaryInfo;

public interface EmployeePrimaryInfoService {

	public String savePrimaryInfo(EmployeePrimaryInfoDto dto);


	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);


	public String saveBank(BankDetailsDto dto);


	public String addEducation(EducationDetailDtoList dto);


	public String addAddressList(AddressDetailList dto);


	public String addContactList(ContactListDto dto);


	public String addExperienceList(ExperienceList dto);

}
