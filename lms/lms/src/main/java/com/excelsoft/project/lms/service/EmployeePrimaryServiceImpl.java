package com.excelsoft.project.lms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelsoft.project.lms.dto.AddressDetailList;
import com.excelsoft.project.lms.dto.BankDetailsDto;
import com.excelsoft.project.lms.dto.ContactListDto;
import com.excelsoft.project.lms.dto.EducationDetailDto;
import com.excelsoft.project.lms.dto.EducationDetailDtoList;
import com.excelsoft.project.lms.dto.EmployeePrimaryInfoDto;
import com.excelsoft.project.lms.dto.EmployeeSecondaryInfoDto;
import com.excelsoft.project.lms.dto.ExperienceList;
import com.excelsoft.project.lms.dto.TechnicalSkillDto;
import com.excelsoft.project.lms.dto.TechnicalSkillDtoList;
import com.excelsoft.project.lms.entity.AddressDetail;
import com.excelsoft.project.lms.entity.BankDetail;
import com.excelsoft.project.lms.entity.Contact;
import com.excelsoft.project.lms.entity.EducationDetail;
import com.excelsoft.project.lms.entity.EmployeePrimaryInfo;
import com.excelsoft.project.lms.entity.EmployeeSecondaryInfo;
import com.excelsoft.project.lms.entity.Experience;
import com.excelsoft.project.lms.entity.TechnicalSkill;
import com.excelsoft.project.lms.exception.EmployeePrimaryException;
import com.excelsoft.project.lms.repository.AddressRepository;
import com.excelsoft.project.lms.repository.BankRepository;
import com.excelsoft.project.lms.repository.ContactRepository;
import com.excelsoft.project.lms.repository.EducationRepository;
import com.excelsoft.project.lms.repository.EmployeeRepository;
import com.excelsoft.project.lms.repository.EmployeeSecondaryRepository;
import com.excelsoft.project.lms.repository.ExperienceRepository;
import com.excelsoft.project.lms.repository.TechnicalSkillRepository;
import com.excelsoft.project.lms.utils.ObjectUtils;

@Service
public class EmployeePrimaryServiceImpl implements EmployeePrimaryInfoService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeSecondaryRepository employeeSecondaryRepository;
	
	@Autowired
	private BankRepository bankRepository;
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ExperienceRepository experienceRepository;
	
	@Autowired
	private TechnicalSkillRepository technicalSkillRepository;
	
	@Override
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) {
		
		if(!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent())
		{
			EmployeePrimaryInfo primaryInfo = ObjectUtils.primaryInfoDto(dto);
			EmployeePrimaryInfo employee = employeeRepository.save(primaryInfo);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("Not added");
	}
	
	//OneToOne mapping 
	@Override
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) 
	{
		
		Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employeeOptional.isPresent())
		{
			EmployeePrimaryInfo employee = employeeOptional.get();
			if(employee.getSecondaryInfo() == null)
			{
				EmployeeSecondaryInfo employeeSecondaryInfo = ObjectUtils.dtoToEntity(dto);
				employee.setSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setPrimaryInfo(employee);
				
				return employeeRepository.save(employee).getEmployeeId();
			}
			else
			{
				EmployeeSecondaryInfo employeeSecondaryInfo = employee.getSecondaryInfo();
				
				employeeSecondaryInfo.setPanNo(dto.getPanNo());
				employeeSecondaryInfo.setAadharNo(dto.getAadharNo());
				employeeSecondaryInfo.setFatherName(dto.getFatherName());
				employeeSecondaryInfo.setMaritalStatus(dto.getMaritalStatus());
				employeeSecondaryInfo.setMotherName(dto.getMotherName());
				employeeSecondaryInfo.setPassportNo(dto.getPassportNo());
				employeeSecondaryInfo.setSpouseName(dto.getSpouseName());
			}
			return employeeRepository.save(employee).getEmployeeId();
		}
		return null;
	}

	//OneToOne Mapping
	@Override
	public String saveBank(BankDetailsDto dto) 
	{
		Optional<EmployeePrimaryInfo> bankOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(bankOptional.isPresent())
		{
			EmployeePrimaryInfo primaryInfo = bankOptional.get();
			if(primaryInfo.getBankDetails() == null)
			{
				BankDetail bank = ObjectUtils.bankToEntity(dto);
				primaryInfo.setBankDetails(bank);
				bank.setPrimaryInfo(primaryInfo);
				return employeeRepository.save(primaryInfo).getEmployeeId();
			}
			else
			{
				
			BankDetail bankDetail = primaryInfo.getBankDetails();
			
			bankDetail.setAccountNo(dto.getAccountNo());
			bankDetail.setAccountType(dto.getAccountType());
			bankDetail.setBankId(dto.getBankId());
			bankDetail.setBankName(dto.getBankName());
			bankDetail.setBranch(dto.getBranch());
			bankDetail.setIfscCode(dto.getIfscCode());
			bankDetail.setState(dto.getState());
		}
		return employeeRepository.save(primaryInfo).getEmployeeId();
	}
		
		return null;
	}

	//OneToMany mapping
	@Override
	public String addEducation(EducationDetailDtoList dto) 
	{
		Optional<EmployeePrimaryInfo> optionalEducation = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalEducation.isPresent())
		{
			EmployeePrimaryInfo employee = optionalEducation.get();
			List<EducationDetail> education = ObjectUtils.educationToEntity(dto.getEducation());
			if(employee.getEducationDetails() != null)
			{
				employee.getEducationDetails().stream().forEach(edu -> educationRepository.delete(edu));
			}
			
			education.stream().forEach(x -> x.setPrimaryInfo(employee));
			employee.setEducationDetails(education);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("Id not found");
	}

	//OneToMany mapping
	@Override
	public String addAddressList(AddressDetailList dto) 
	{
		Optional<EmployeePrimaryInfo> optionalAddress = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalAddress.isPresent())
		{
			EmployeePrimaryInfo employee = optionalAddress.get();
			List<AddressDetail> address = ObjectUtils.addressToEntity(dto.getAddress());
			if(employee.getAddressDetails()!=null)
			{
				employee.getAddressDetails().stream().forEach(edu -> addressRepository.delete(edu));
			}
			address.stream().forEach(x -> x.setPrimaryInfo(employee));
			employee.setAddressDetails(address);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("Id not found");
	}

	//OneToMany mapping
	@Override
	public String addContactList(ContactListDto dto) 
	{
		Optional<EmployeePrimaryInfo> optionalContact = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalContact.isPresent())
		{
			EmployeePrimaryInfo employee = optionalContact.get();
			List<Contact> contact = ObjectUtils.contactToEntity(dto.getContact());
			if(employee.getContacts()!=null)
			{
				employee.getContacts().stream().forEach(edu -> contactRepository.delete(edu));
				
			}
			contact.stream().forEach(x -> x.setPrimaryInfo(employee));
			employee.setContacts(contact);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("ID not found");
	}

	//OneToMany mapping
	@Override
	public String addExperienceList(ExperienceList dto) {
		
		Optional<EmployeePrimaryInfo> optionalExperience = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalExperience.isPresent())
		{
			EmployeePrimaryInfo employee = optionalExperience.get();
			List<Experience> experience = ObjectUtils.experienceToEntity(dto.getExperience());
			if(employee.getExperiences()!=null)
			{
				employee.getExperiences().stream().forEach(edu -> experienceRepository.delete(edu));
			}
			
			experience.stream().forEach(x -> x.setPrimaryInfo(employee));
			employee.setExperiences(experience);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("error");
	}

	//ManyToMany mapping
	@Override
	public String addSkills(TechnicalSkillDtoList dto) 
	{
		Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employeeOptional.isPresent())
		{
			EmployeePrimaryInfo employee = employeeOptional.get();
			List<TechnicalSkill> skills = dto.getSkills().stream().map(skill ->
			{
				Optional<TechnicalSkill> optional = technicalSkillRepository
						.findBySkillTypeAndSkillRatingAndYearOfExperience(skill.getSkillType(), skill.getSkillRating(), skill.getYearOfExperience());
				
				return optional.isPresent() ? optional.get() : ObjectUtils.dtoToEntity(skill);				
			}).collect(Collectors.toList());

			if(employee.getTechnicalSkills() != null)
			{
				employee.getTechnicalSkills().clear();
			}
			
			skills.stream().forEach(x -> {
				if(!x.getPrimaryInfos().contains(employee))
					x.getPrimaryInfos().add(employee);
			});
			
			employee.setTechnicalSkills(skills);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("error");
	}
}
	


