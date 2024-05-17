package com.excel.lms.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.response.CommonResponse;
import com.excel.lms.service.EmployeePrimaryService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/employee")
@RestController
public class EmployeeRegisterController {

	@Autowired
	private final EmployeePrimaryService employeePrimaryService;
	
	@GetMapping(path = "/get")
	public EmployeePrimaryInfoDto get()
	{
		return EmployeePrimaryInfoDto.builder().dateOfJoining(LocalDate.now()).build();
	}
	
	@PostMapping(path = "/pinfo")
	public ResponseEntity<CommonResponse<String>> postPrimaryInfo(@RequestBody EmployeePrimaryInfoDto dto)
	{
		String employeeId = employeePrimaryService.savePrimaryInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(CommonResponse
				.<String>builder().data(employeeId).message("Employee info saved").build());
	}
}
