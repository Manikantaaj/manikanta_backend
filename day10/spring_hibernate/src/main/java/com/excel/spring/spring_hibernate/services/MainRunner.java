package com.excel.spring.spring_hibernate.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.spring.spring_hibernate.entites.JavaConfig;
import com.excel.spring.spring_hibernate.entites.Student;
import com.excel.spring.spring_hibernate.entites.StudentDao;

public class MainRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		
		Student student = new Student();
		
//		student.setId(12);
//		student.setName("mani");
//		student.setCity("mysore");
		
//		student.setId(14);
//		student.setName("manju");
//		student.setCity("mandya");
		
//		dao.insert(student);
		
//		int update=dao.update(new Student(14, "ajith", "bangalore"));
//		System.out.println(update);
//		
//		int deleteDb = dao.delete(2);
//		System.out.println(deleteDb);
		
//		Student res = dao.getStudent(14);
//		System.out.println(res);
		
		List<Student> student1 = dao.getAllStudents();
		System.out.println(student1);
	}
}
