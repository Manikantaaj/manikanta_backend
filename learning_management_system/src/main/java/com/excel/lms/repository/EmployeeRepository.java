package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeePrimaryInfo;

public interface EmployeeRepository extends JpaRepository<EmployeePrimaryInfo, Integer>{

	Object findByEmployeeId(String employeeId);

}
