package excelsoft.treeset;

import java.util.Comparator;

public class Employee implements Comparator<Employee> 
{
	public Integer id;
	public String name;
    public Integer salary;
	
	

	public Employee() {
		super();
	
	}



	public Employee(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		return 0;
	}

}
