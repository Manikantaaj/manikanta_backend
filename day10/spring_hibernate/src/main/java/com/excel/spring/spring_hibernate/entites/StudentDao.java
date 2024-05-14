package com.excel.spring.spring_hibernate.entites;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;



@Component
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student)
	{
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	public Student getStudent(int student_id)
	{
		Student student = this.hibernateTemplate.get(Student.class, student_id);
		return student;
	}
	
	@Transactional
	public int delete(int student_id)
	{
		Student student = this.hibernateTemplate.get(Student.class, student_id);
		this.hibernateTemplate.delete(student);
		return student_id;
	}
	
	@Transactional
	public int update(Student student)
	{
		this.hibernateTemplate.update(student);
		return 0;
	}
	
	public List<Student> getAllStudents()
	{
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
		
	}
}
