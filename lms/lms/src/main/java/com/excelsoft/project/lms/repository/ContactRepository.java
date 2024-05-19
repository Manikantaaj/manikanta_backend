package com.excelsoft.project.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelsoft.project.lms.dto.ContactDto;
import com.excelsoft.project.lms.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
