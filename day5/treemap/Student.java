package excelsoft.treemap;

import java.util.Comparator;

public class Student{
	
	public Integer id;
	public String name;
	public String city;
	
	public Student(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
	
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.city;
	}
	

	
	
	
	
}
