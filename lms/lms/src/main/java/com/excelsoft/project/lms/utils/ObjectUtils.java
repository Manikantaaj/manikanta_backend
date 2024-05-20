package com.excelsoft.project.lms.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.excelsoft.project.lms.dto.AddressDetailDto;
import com.excelsoft.project.lms.dto.BankDetailsDto;
import com.excelsoft.project.lms.dto.ContactDto;
import com.excelsoft.project.lms.dto.EducationDetailDto;
import com.excelsoft.project.lms.dto.EducationDetailDtoList;
import com.excelsoft.project.lms.dto.EmployeePrimaryInfoDto;
import com.excelsoft.project.lms.dto.EmployeeSecondaryInfoDto;
import com.excelsoft.project.lms.dto.ExperienceDto;
import com.excelsoft.project.lms.dto.TechnicalSkillDto;
import com.excelsoft.project.lms.entity.AddressDetail;
import com.excelsoft.project.lms.entity.BankDetail;
import com.excelsoft.project.lms.entity.Contact;
import com.excelsoft.project.lms.entity.EducationDetail;
import com.excelsoft.project.lms.entity.EmployeePrimaryInfo;
import com.excelsoft.project.lms.entity.EmployeeSecondaryInfo;
import com.excelsoft.project.lms.entity.Experience;
import com.excelsoft.project.lms.entity.TechnicalSkill;
import com.excelsoft.project.lms.enums.ContactType;

public class ObjectUtils {

	private ObjectUtils() {

	}

	public static EmployeePrimaryInfo primaryInfoDto(EmployeePrimaryInfoDto dto) 
	{
		return EmployeePrimaryInfo.builder().primaryId(dto.getPrimaryId())
				.employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName())
				.dateOfJoining(dto.getDateOfJoining())
				.dateOfBirth(dto.getDateOfBirth())
				.designation(dto.getDesignation())
				.bloodGroup(dto.getBloodGroup())
				.email(dto.getEmail()).employeeStatus(dto.getEmployeeStatus())
				.gender(dto.getGender())
				.nationality(dto.getNationality()).build();
	}

	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto employee) {
		return EmployeeSecondaryInfo.builder().secondaryId(employee.getSecondaryId()).aadharNo(employee.getAadharNo())
				.fatherName(employee.getFatherName()).maritalStatus(employee.getMaritalStatus())
				.motherName(employee.getMotherName()).panNo(employee.getPanNo()).passportNo(employee.getPassportNo())
				.spouseName(employee.getSpouseName()).build();
	}

	public static BankDetail bankToEntity(BankDetailsDto bank) {
		return BankDetail.builder().bankId(bank.getBankId()).accountNo(bank.getAccountNo())
				.accountType(bank.getAccountType()).bankName(bank.getBankName()).branch(bank.getBranch())
				.state(bank.getState()).ifscCode(bank.getIfscCode()).build();
	}

	public static List<EducationDetail> educationToEntity(List<EducationDetailDto> education) 
	{   
		return education.stream()
	    		.map(x -> EducationDetail.builder()
	            .educationType(x.getEducationType())
	            .yearOfPassing(x.getYearOfPassing())
	            .percentage(x.getPercentage())
	            .instituteName(x.getInstituteName())
	            .universityName(x.getUniversityName())
	            .specialization(x.getSpecialization())
	            .build())
	            .collect(Collectors.toList());
	}


	public static List<AddressDetail> addressToEntity(List<AddressDetailDto> address) 
	{
		return address.stream()
				.map(x -> AddressDetail.builder()
						.addressId(x.getAddressId())
						.addressType(x.getAddressType())
						.city(x.getCity()).doorNo(x.getDoorNo())
						.landMark(x.getLandMark())
						.locality(x.getLocality())
						.pinCode(x.getPinCode())
						.build())
						.collect(Collectors.toList());
	}

	public static List<Contact> contactToEntity(List<ContactDto> contact) 
	{
		return contact.stream()
				.map(x -> Contact.builder().contactId(x.getContactId())
				.contactNumber(x.getContactNumber())
				.contactType(x.getContactType())
				.build())
				.collect(Collectors.toList());
	}

	public static List<Experience> experienceToEntity(List<ExperienceDto> experience) 
	{
		return experience.stream()
			.map(x -> Experience.builder().companyName(x.getCompanyName())
				.dateOfJoining(x.getDateOfJoining())
				.dateOfRelieving(x.getDateOfRelieving())
				.experienceId(x.getExperienceId())
				.designation(x.getDesignation())
				.location(x.getLocation())
				.yearOfExperience(x.getYearOfExperience())
				.build()).collect(Collectors.toList());
	}
	
	public static TechnicalSkill dtoToEntity(TechnicalSkillDto skill) 
	{
		return TechnicalSkill.builder().skillType(skill.getSkillType()).skillRating(skill.getSkillRating())
				.yearOfExperience(skill.getYearOfExperience()).primaryInfos(new ArrayList<>()).build();

	}
	
}
