//package com.excel.hibernate_manikanta.onetomany;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.excel.hibernate_manikanta.onetomany.entity.Laptop;
//import com.excel.hibernate_manikanta.onetomany.entity.Student;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class MainRunner {
//
//	public static void main(String[] args) {
//		
//			
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		
//		List<Laptop> laptops = new ArrayList<>();
//		
//		Laptop laptops1 = new Laptop();
//		Laptop laptops2 = new Laptop();
//		Laptop laptops3 = new Laptop();
//		Student student = new Student();
//		
//		laptops1.setBrand("Dell");
//		laptops1.setSerialNo("GH123214");
//		laptops1.setStudent(student);
//		
//		laptops2.setBrand("HP");
//		laptops2.setSerialNo("GL23423");
//		laptops2.setStudent(student);
//		
//		laptops3.setBrand("Mac");
//		laptops3.setSerialNo("GHF123214");
//		laptops3.setStudent(student);
//		
//		laptops.add(laptops1);
//		laptops.add(laptops2);
//		laptops.add(laptops3);
//		
//		student.setName("manju");
//		student.setAge(25);
//		student.setLaptos(laptops);
//		
//		transaction.begin();
//		manager.persist(student);
//		transaction.commit();
//		System.out.println(manager.find(Student.class, 1));
//		
//		
//	}
//}
