package com.excelsoft.project.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelsoft.project.lms.entity.AddressDetail;

public interface AddressRepository extends JpaRepository<AddressDetail, Integer>
{

}
