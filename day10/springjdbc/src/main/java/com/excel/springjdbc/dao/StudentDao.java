package com.excel.springjdbc.dao;

import java.util.List;

import com.excel.springjdbc.entities.Student;


public interface StudentDao {

	int insertStudent(Student student);

	int updateStudent(Student student);

	int deleteStudent(int id);

	List<Student> getAllStudent();



}
