package com.excelsoft.project.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelsoft.project.lms.dto.EmployeePrimaryInfoDto;
import com.excelsoft.project.lms.entity.EmployeePrimaryInfo;


public interface EmployeeRepository extends JpaRepository<EmployeePrimaryInfo, Integer>{

	Optional<EmployeePrimaryInfo> findByEmployeeId(String employeeId);



}
