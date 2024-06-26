package com.excelsoft.project.lms.entity;

import java.time.LocalDate;

import com.excelsoft.project.lms.enums.Designation;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "experience")
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer experienceId;
	
	private String companyName;
	private String yearOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	
	private String location;
	
	@JoinColumn(name = "employee_id")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private EmployeePrimaryInfo primaryInfo;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private EmployeePrimaryInfo primaryInfo;
}
