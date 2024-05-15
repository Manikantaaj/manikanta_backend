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
import com.excel.demo.repository.EmployeeRefository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	List<Employee> employees = new ArrayList<Employee>();
	
	@Autowired
	private EmployeeRefository employeeRefository;
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		
		Employee employee = Employee.builder().firstName(dto.getFirstName())
				.lastName(dto.getLastName()).mobileNo(dto.getMobileNo())
				.aadharNo(dto.getAadharNo()).panNo(dto.getPanNo())
				.employeeNo(dto.getEmployeeNo()).build();
		
//		employee.setId((int)(Math.random()*10));
//		employees.add(employee);
		
		Employee save = employeeRefository.save(employee);

		return EmployeeDto.builder().id(employee.getId()).firstName(save.getFirstName())
				.lastName(save.getLastName())
				.mobileNo(save.getMobileNo())
				.aadharNo(save.getAadharNo())
				.panNo(save.getPanNo())
				.employeeNo(save.getEmployeeNo()).build();
		
		
	}

	
	
	@Override
	public void deleteEmployee(EmployeeDto dto) {
		
	Optional<Employee> optional = employeeRefository.findById(dto.getId());
	if(optional.isPresent())
		employeeRefository.delete(optional.get());
	else
		throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_ID_FOUND);
		
	}
	
	
	@Override
	public List<EmployeeDto> getAllEmployee() {
		
		return employeeRefository.findAll().stream()
				.map(e -> EmployeeDto.builder().id(e.getId())
						.firstName(e.getFirstName()).lastName(e.getLastName())
						.mobileNo(e.getMobileNo()).aadharNo(e.getAadharNo())
						.panNo(e.getPanNo()).employeeNo(e.getEmployeeNo())
						.build()).toList();
		
		
	}



	@Override
	public EmployeeDto getById(int id) {
		
		return null;
	}






	
	
}
