package com.excelsoft.project.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelsoft.project.lms.entity.TechnicalSkill;

public interface TechnicalSkillRepository extends JpaRepository<TechnicalSkill, Integer>
{
	Optional<TechnicalSkill> findBySkillTypeAndSkillRatingAndYearOfExperience(
			String skillType, String skillRating, Integer yearOfExperience);
	
}
