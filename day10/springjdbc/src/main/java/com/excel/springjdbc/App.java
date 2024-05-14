package com.excel.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.springjdbc.dao.StudentDao;
import com.excel.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
       
       StudentDao dao = context.getBean("studentDao", StudentDao.class);
       
       Student student = new Student();
//       student.setId(121);
//       student.setName("mani");
//       student.setMarks(80);
       
//       student.setId(14);
//       student.setName("manju");
//       student.setMarks(75);
       
//       student.setId(45);
//       student.setName("sanju");
//       student.setMarks(56);
       
//       int res = dao.insertStudent(student);
//       System.out.println(res);
       
       
//       int res = dao.updateStudent(new Student(14, "ajith", 35));  
//       System.out.println(res);
       
//       int res = dao.deleteStudent(121);
//       System.out.println(res);
       
       List<Student> list =(List<Student>) dao.getAllStudent();
       
       for(Student index : list) {
           System.out.println(index);

    }
}
}
 