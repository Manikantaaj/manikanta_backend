package com.excel.hibernate_manikanta.manytomany;

import java.util.ArrayList;
import java.util.List;

import com.excel.hibernate_manikanta.manytomany.entity.Book;
import com.excel.hibernate_manikanta.manytomany.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Book> book = new ArrayList<Book>();
		List<Student> students = new ArrayList<Student>();
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.setTitle("Rich Dad Poor Dad");
		b2.setTitle("Cosmos");
		b3.setTitle("Othello");
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setName("john");
		student1.setBook(book);
		
		student2.setName("dhoni");
		student2.setBook(book);
		
		student2.setName("rahul");
		student3.setBook(book);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		b1.setStudent(students);
		b2.setStudent(students);
		b3.setStudent(students);
		
		transaction.begin();
		manager.persist(student2);
		transaction.commit();
	}
}
