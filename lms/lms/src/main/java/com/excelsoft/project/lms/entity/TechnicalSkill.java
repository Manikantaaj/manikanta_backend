package com.excelsoft.project.lms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	
	@JoinTable(name = "map_skill_employee", joinColumns = @JoinColumn(name = "skill_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<EmployeePrimaryInfo> primaryInfos;
	
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private List<EmployeePrimaryInfo> listOfSkills = new ArrayList<EmployeePrimaryInfo>();
}
