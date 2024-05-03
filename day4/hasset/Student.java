package excelsoft.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Student {

	public Integer marks;
	public String name;
	public Integer age;
	public Student(Integer marks, String name, Integer age) {
		super();
		this.marks = marks;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		
	}
	
	@Override
	public String toString()
	{
		return this.marks + " " + this.name + " " + this.age;
	}
	@Override
	public int hashCode()
	{
		return this.age;
	}
	
	@Override
	public boolean equals(Object s)
	{
		Student st = (Student)s;
		
		return this.name == st.name && this.marks == st.marks;
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Student> std = new HashSet<>();
		while(true)
		{
			System.out.println("Enter student marks");
			int marks = scanner.nextInt();
			System.out.println("Enter student name");
			String name = scanner.next();
			System.out.println("Enter student age");
			int age = scanner.nextInt();
			
			std.add(new Student(marks,name,age));
			System.out.println("you want to add more student");
			if(!scanner.next().equalsIgnoreCase("yes"))
				break;
		}
		scanner.close();
		
		Iterator<Student> itr = std.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}
