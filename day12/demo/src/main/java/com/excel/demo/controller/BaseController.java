package com.excel.demo.controller;

import java.util.List;
import static com.excel.demo.constant.EmployeeConstant.EMPLOYEE_DELETED_SUCCESS;
import static com.excel.demo.constant.EmployeeConstant.EMPLOYEE_ADD_SUCCESS;
import static com.excel.demo.constant.EmployeeConstant.EMPLOYEE_UPDATE_SUCCESS;
import static com.excel.demo.constant.EmployeeConstant.GET_ONE_EMPLOYEE_SUCCESS;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.DemoApplication;
import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.response.CommonResponse;
import com.excel.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/employee")
public class BaseController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<CommonResponse<EmployeeDto>> getEmployee(@PathVariable Integer id)
	{
		EmployeeDto dto = employeeService.getEmployee(id);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse
				.<EmployeeDto>builder().data(dto)
				.isError(false).message(GET_ONE_EMPLOYEE_SUCCESS).build());
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> fetchAllEmployees()
	{
		return ResponseEntity.ok(employeeService.getAllEmployee());
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<CommonResponse<EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee)
	{
//		System.out.println(employee.getFirstName() + " "
//				+ employee.getLastName() + " "
//				+ employee.getMobileNo() + " "
//	+ employee.getAadharNo() + " "
//	+ employee.getPanNo() + " "
//	+ employee.getEmployeeNo());
		
		EmployeeDto dto = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.
				<EmployeeDto>builder().data(dto).isError(false)
				.message(EMPLOYEE_ADD_SUCCESS).build());
	}
	
	@PutMapping("/put")
	public ResponseEntity<CommonResponse<EmployeeDto>> updateEmployee(@RequestBody EmployeeDto dto)
	{
		EmployeeDto updatedEmployee = employeeService.updateEmployee(dto);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse
				.<EmployeeDto>builder().data(updatedEmployee)
				.isError(false).message(EMPLOYEE_UPDATE_SUCCESS).build());
	}

	@DeleteMapping("/delete")
	public ResponseEntity<CommonResponse<EmployeeDto>> deleteEmployee(@RequestBody EmployeeDto dto)
	{
		employeeService.deleteEmployee(dto.getId());
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse
				.<EmployeeDto>builder()
				.data(dto).isError(false).message(EMPLOYEE_DELETED_SUCCESS).build());
	}
	
//	@PutMapping("/home/{str}")
//	public ResponseEntity<String> homePutReq(@PathVariable String str, @RequestParam String str1, @RequestParam String string)
//	{
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(str + " " + str1 + " " + string);
//	}
	
	
}
