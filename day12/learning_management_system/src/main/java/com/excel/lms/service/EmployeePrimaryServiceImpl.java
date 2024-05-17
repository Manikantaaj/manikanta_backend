package com.excel.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.utils.ObjectUtils;

@Service
public class EmployeePrimaryServiceImpl implements EmployeePrimaryService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) 
	{
		if(!((Object) employeeRepository.findByEmployeeId(dto.getEmployeeId())).isPresent())
			{
			EmployeePrimaryInfo primaryInfo1 = ObjectUtils.primaryInfoDto(dto);
			EmployeePrimaryInfo primaryInfo2 = employeeRepository.save(primaryInfo1);
			return primaryInfo2.getEmployeeId();
		}
		throw new Employee;
	}

}
