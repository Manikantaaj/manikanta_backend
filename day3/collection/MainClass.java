package excelsoft.collection;
import java.util.Scanner;
import java.util.LinkedList;

public class MainClass {
	
	public static void main(String[] args) {
		

	LinkedList<Employee> employees = new LinkedList<>();
	
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter Employee Id");
			int id = scanner.nextInt();
			System.out.println("Enter Employee Name");
			String name = scanner.next();
			System.out.println("Enter Employee Salary");
			int salary = scanner.nextInt();
			
			employees.add(new Employee(id,name,salary));
			System.out.println("you want to add more employee");
			if(!scanner.next().equalsIgnoreCase("yes"))
				break;
		}
		
//		employees.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
		
		
		// Collections.sort(employees,(e1,e2)->(e1.getId()).compareTo(e2.getId()));
		//employees.forEach(System.out::println);
		//s.close();
		
		Collections.sort(employees);
		employees.forEach(System.out :: println );
		s.close();
	}
	
}

