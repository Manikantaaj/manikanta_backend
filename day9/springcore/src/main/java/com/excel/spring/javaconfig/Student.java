package com.excel.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	private Samosa samosa;
	
	public Student(Samosa samosa)
	{
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public void study()
	{
		this.samosa.displayPrice();
		System.out.println("Student is studying");
	}
}
