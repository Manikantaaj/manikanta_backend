package excelsoft.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import excelsoft.hashset.Student;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Comparator<Employee> com = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) 
			{
				
				return((Integer)o1.id).compareTo(o2.id);
			}
		};
		TreeSet<Employee> ts = new TreeSet<Employee>(com);
		while(true)
		{
			System.out.println("Enter student id");
			int id = scanner.nextInt();
			System.out.println("Enter student name");
			String name = scanner.next();
			System.out.println("Enter student salary");
			int salary = scanner.nextInt();
			
			ts.add(new Employee(id, name, salary));
			System.out.println("you want to add more student");
			if(!scanner.next().equalsIgnoreCase("yes"))
				break;
		}
		
		scanner.close();
		
		Iterator<Employee> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
