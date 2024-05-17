
package com.excel.lms.entity;

import com.excel.lms.enums.MaritalStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "employee_secondary_info")
public class EmployeeSecondaryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer secondaryId;
	
	private String panNo;
	private String aadharNo;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passportNo;
	
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	
	@JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "secondary_info")
	private EmployeePrimaryInfo primaryInfo;
}
