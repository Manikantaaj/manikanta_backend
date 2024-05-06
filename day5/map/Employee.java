package excelsoft.map;

public class Employee {
	public Integer id;
	public String name;
	public String designation;
	public String dept;
	
	public Employee() {
		super();
	}
	public Employee(Integer id, String name, String designation, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.dept = dept;
	}
	
	

	
	@Override
	public String toString()
	{
		return this.id + " " + this.name + " " + this.designation + " " + this.dept;
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
	
	
}

