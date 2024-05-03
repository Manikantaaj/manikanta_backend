package excelsoft.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Employee {

	public Integer id;
	public String name;
	public Integer salary;
	
	public Employee(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	
	@Override
	public String toString()
	{
		return this.id + " " + this.name + " " + this.salary;
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
		
	}
	
	@Override
	public boolean equals(Object e)
	{
		Employee emp = (Employee)e;
		return this.hashCode() == emp.hashCode();
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Employee> hs = new HashSet<>();
		while(true)
		{
			System.out.println("Enter Employee Id");
			int id = scanner.nextInt();
			System.out.println("Enter Employee Name");
			String name = scanner.next();
			System.out.println("Enter Employee Salary");
			int salary = scanner.nextInt();
			
			hs.add(new Employee(id,name,salary));
			System.out.println("you want to add more employee");
			if(!scanner.next().equalsIgnoreCase("yes"))
				break;
		}
		scanner.close();
		
		Iterator<Employee> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
