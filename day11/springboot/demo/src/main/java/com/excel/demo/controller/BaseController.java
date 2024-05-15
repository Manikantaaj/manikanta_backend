package com.excel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.DemoApplication;
import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BaseController {

	@Autowired
	private final EmployeeService employeeService;
	
	
	@GetMapping("/getId")
	public ResponseEntity<EmployeeDto> getById(@PathVariable int id)
	{
		EmployeeDto dto = employeeService.getById(id);
		return ResponseEntity.ok(employeeService.getById(id));
	}
	
	
	
	@PostMapping("/add")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employee)
	{
//		System.out.println(employee.getFirstName() + " "
//				+ employee.getLastName() + " "
//				+ employee.getMobileNo() + " "
//	+ employee.getAadharNo() + " "
//	+ employee.getPanNo() + " "
//	+ employee.getEmployeeNo());
		
		EmployeeDto dto = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	
	
	
	
	
	
	@PutMapping("/home/{str}")
	public ResponseEntity<String> homePutReq(@PathVariable String str, @RequestParam String str1, @RequestParam String string)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(str + " " + str1 + " " + string);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeDto dto)
	{
		employeeService.deleteEmployee(dto);
		return ResponseEntity.ok(EmployeeConstant.EMPLOYEE_DELETED_SUCCESS);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> fetchAllEmployees()
	{
		return ResponseEntity.ok(employeeService.getAllEmployee());
		
	}
}
