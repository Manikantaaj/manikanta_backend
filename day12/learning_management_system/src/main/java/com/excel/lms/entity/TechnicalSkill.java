package com.excel.lms.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
@Table(name = "technical_skills")
public class TechnicalSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillId;
	
	private String skillType;
	private String skillRating;
	private Integer yearOfExperience;
	
//	@JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "technicalSkills")
//	private EmployeePrimaryInfo primaryInfo;
}
