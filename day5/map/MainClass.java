package excelsoft.map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

import excelsoft.treeset.Employee;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Employee> employees = new HashMap<>();
		while(true)
		{
			System.out.println("Enter Employee id");
			int id = sc.nextInt();
			System.out.println("Enter Employee name");
			String name = sc.next();
			System.out.println("Enter Employee Designation");
			String designation = sc.next();
			System.out.println("Enter Employee Department");
			String dept = sc.next();
			
			employees.put(id, new Employee(name, designation, dept));
			
			System.out.println("you want to add more Employee");
			String res = sc.next();
			if(res.equalsIgnoreCase("yes"))
				break;
		}
		
		sc.close();
		
		Set<Entry<Integer, Employee>> entrySet = employees.entrySet();
		
		for(Entry<Integer, Employee> entry : entrySet)
		{
			System.out.println(entry.getKey() + "===>" + entry.getValue());
		}
	}


}
