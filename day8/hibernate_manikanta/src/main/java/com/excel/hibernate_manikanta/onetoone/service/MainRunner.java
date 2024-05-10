//package com.excel.hibernate_manikanta.onetoone.service;
//
//import com.excel.hibernate_manikanta.onetoone.entity.MarksCard;
//import com.excel.hibernate_manikanta.onetoone.entity.Student;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class MainRunner {
//
//	private static EntityManagerFactory factory;
//	private static EntityManager manager;
//	private static EntityTransaction transaction; 
//	public static void main(String[] args) {
//		
//		factory = Persistence.createEntityManagerFactory("student");
//		manager = factory.createEntityManager();
//		transaction = manager.getTransaction();
//		
//		MarksCard card = new MarksCard();
//		card.setGrade("A");
//		card.setMarks(85);
//		
//		
//		Student st = new Student();
//		st.setName("mani");
//		st.setAge(26);
//		st.setMarksCard(card);
//		
//		transaction.begin();
//		manager.persist(card);
//		transaction.commit();
//		
//		manager.close();
//	}
//}
