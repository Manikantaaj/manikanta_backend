package com.excel.demo.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.exception.EmployeeNotFoundException;
import com.excel.demo.repository.EmployeeRepository;
import com.excel.demo.util.EmployeeUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j //used for log.info(print)
@Service
public class EmployeeServiceImpl implements EmployeeService {

//	List<Employee> employees = new ArrayList<Employee>();
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		
		Employee employee = Employee.builder().firstName(dto.getFirstName())
				.lastName(dto.getLastName()).mobileNo(dto.getMobileNo())
				.aadharNo(dto.getAadharNo()).panNo(dto.getPanNo())
				.employeeNo(dto.getEmployeeNo()).build();
		
//		employee.setId((int)(Math.random()*10));
//		employees.add(employee);
		
		Employee save = employeeRepository.save(employee);

		return EmployeeUtils.entityToDto(employee);
	}
	
	@Override
	public List<EmployeeDto> getAllEmployee() {
		
		return employeeRepository.findAll().stream()
				.map(EmployeeUtils :: entityToDto).toList();	
	}

	@Override
	public EmployeeDto getEmployee(Integer id) 
	{
		try {
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isPresent())
		{
			Employee employee = optional.get();
			return EmployeeUtils.entityToDto(employee);
		}
			throw new EmployeeNotFoundException("Employee not found ID:" + id);
	
		}
		catch(EmployeeNotFoundException e)
		{
			throw e;
		}
		catch(Exception e)
		{
			log.info("EmployeeServiceImpl :: addEmployee ===> " + e.getMessage());
			throw new EmployeeNotFoundException("Something went wrong fetching Employee!");
		}
}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto dto) 
	{
		try {
			Optional<Employee> optional = employeeRepository.findById(dto.getId());
		if(optional.isPresent())
		{
		Employee employee = optional.get();
		employee = EmployeeUtils.updateValues(employee, dto);
		employeeRepository.save(employee);
		}
		throw new EmployeeNotFoundException("Employee not found Id:");
		}
		catch (EmployeeNotFoundException e) 
		{
			throw e;
		}
		
		catch (Exception e) 
		{
			log.info("EmployeeServiceImpl :: addEmployee ===> " + e.getMessage());
			throw new EmployeeNotFoundException("Something went wrong update Employee!");
		}
	}



	@Override
	public void deleteEmployee(Integer id) 
	{
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional.isPresent())
			employeeRepository.delete(optional.get());
		else
     		throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_ID_FOUND);
	}	
	
//	@Override
//	public void deleteEmployee(EmployeeDto dto) {
//		
//	Optional<Employee> optional = employeeRepository.findById(dto.getId());
//	if(optional.isPresent())
//		employeeRepository.delete(optional.get());
//	else
//		throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_ID_FOUND);
//		
//	}
	
}
