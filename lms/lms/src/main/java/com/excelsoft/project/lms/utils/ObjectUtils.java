package com.excelsoft.project.lms.utils;

import com.excelsoft.project.lms.dto.AddressDetailDto;
import com.excelsoft.project.lms.dto.BankDetailsDto;
import com.excelsoft.project.lms.dto.ContactDto;
import com.excelsoft.project.lms.dto.EducationDetailDto;
import com.excelsoft.project.lms.dto.EmployeePrimaryInfoDto;
import com.excelsoft.project.lms.dto.EmployeeSecondaryInfoDto;
import com.excelsoft.project.lms.dto.ExperienceDto;
import com.excelsoft.project.lms.entity.AddressDetail;
import com.excelsoft.project.lms.entity.BankDetail;
import com.excelsoft.project.lms.entity.Contact;
import com.excelsoft.project.lms.entity.EducationDetail;
import com.excelsoft.project.lms.entity.EmployeePrimaryInfo;
import com.excelsoft.project.lms.entity.EmployeeSecondaryInfo;
import com.excelsoft.project.lms.entity.Experience;
import com.excelsoft.project.lms.enums.ContactType;

public class ObjectUtils {
	
	private ObjectUtils()
	{
		
	}
	
	public static EmployeePrimaryInfo primaryInfoDto(EmployeePrimaryInfoDto dto)
	{
		return EmployeePrimaryInfo.builder().primaryId(dto.getPrimaryId()).employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName()).dateOfJoining(dto.getDateOfJoining())
				.dateOfBirth(dto.getDateOfBirth()).designation(dto.getDesignation())
				.bloodGroup(dto.getBloodGroup()).email(dto.getEmail())
				.employeeStatus(dto.getEmployeeStatus())
				.gender(dto.getGender()).nationality(dto.getNationality()).build();
	}
	
	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto employee)
	{
		return EmployeeSecondaryInfo.builder().secondaryId(employee.getSecondaryId()).aadharNo(employee.getAadharNo())
				.fatherName(employee.getFatherName()).maritalStatus(employee.getMaritalStatus()).motherName(employee.getMotherName())
				.panNo(employee.getPanNo()).passportNo(employee.getPassportNo()).spouseName(employee.getSpouseName()).build();
	}
	
	public static BankDetail bankToEntity(BankDetailsDto bank)
	{
		return BankDetail.builder().bankId(bank.getBankId()).accountNo(bank.getAccountNo())
				.accountType(bank.getAccountType())
				.bankName(bank.getBankName()).branch(bank.getBranch()).state(bank.getState())
				.ifscCode(bank.getIfscCode()).build();
	}
	
	public static EducationDetail educationToEntity(EducationDetailDto education)
	{
		return EducationDetail.builder().educationId(education.getEducationId()).educationType(education.getEducationType())
				.instituteName(education.getInstituteName()).instituteName(education.getInstituteName()).percentage(education.getPercentage())
				.specialization(education.getSpecialization()).yearOfPassing(education.getYearOfPassing())
				.state(education.getState()).universityName(education.getUniversityName()).build();
	}
	
	public static AddressDetail addressToEntity(AddressDetailDto address)
	{
		return AddressDetail.builder().addressId(address.getAddressId()).addressType(address.getAddressType())
				.city(address.getCity()).doorNo(address.getDoorNo()).landMark(address.getLandMark())
				.locality(address.getLocality()).pinCode(address.getPinCode()).build();
	}
	
	public static Contact contactToEntity(ContactDto contact)
	{
		return Contact.builder().contactId(contact.getContactId()).contactNumber(contact.getContactNumber())
				.contactType(contact.getContactType()).build();
	}
	
	public static Experience experienceToEntity(ExperienceDto experience)
	{
		return Experience.builder().companyName(experience.getCompanyName()).dateOfJoining(experience.getDateOfJoining())
				.dateOfRelieving(experience.getDateOfRelieving()).experienceId(experience.getExperienceId())
				.designation(experience.getDesignation()).location(experience.getLocation())
				.yearOfExperience(experience.getYearOfExperience()).build();
	}
}
