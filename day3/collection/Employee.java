package excelsoft.collection;

public class Employee implements Comparable<Employee> 
{
	
	private Integer id;
	private String name;
	private Integer salary;
	
	
	public Employee() {
		super();
	}


	public Employee(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		salary = salary;
	}


	@Override
	public int compareTo(Employee o) 
	{
		return this.id.compareTo(o.id);
	}
	
	@Override
	public String toString(Object o)
	{
		return id + " " + name + " " + salary;
		
	}

}
