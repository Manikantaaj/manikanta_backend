package com.excelsoft.project.lms.entity;



import com.excelsoft.project.lms.enums.AccountType;

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
@Table(name = "bank_details")
public class BankDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bankId;
	
	private String accountNo;
	private String bankName;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	private String ifscCode;
	private String branch;
	private String state;
	
	@JoinColumn(name = "employee_id")
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private EmployeePrimaryInfo primaryInfo;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	private EmployeePrimaryInfo primaryInfo;
}

