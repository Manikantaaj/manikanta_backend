package com.excelsoft.project.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelsoft.project.lms.entity.BankDetail;

public interface BankRepository extends JpaRepository<BankDetail, Integer> {

}
