package com.excelsoft.project.lms.entity;



import com.excelsoft.project.lms.enums.ContactType;

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
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId;
	
	@Enumerated(EnumType.STRING)
	private ContactType contactType;
	
	private String contactNumber;
	
	@JoinColumn(name = "employee_id")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private EmployeePrimaryInfo primaryInfo;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	private EmployeePrimaryInfo primaryInfo;
}
