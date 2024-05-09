package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
		
	private static Connection connection;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		Employee employee = new Employee();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Press 1 for Insert record");
			System.out.println("Press 2 for Select record");
			System.out.println("Press 3 for SelectAll record");
			System.out.println("Press 4 for Update record");
			System.out.println("Press 5 for Delete record");
			
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1:
				employee.insertRecord();
				break;
			case 2:
				employee.selectRecord();
				break;
			case 3:
				employee.selectAllRecord();
				break;
			case 4:
				employee.updateRecord();
				break;
			case 5:
				employee.deleteRecord();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	private void insertRecord() throws SQLException
	{
		String query = "insert into employee(name, sal, dept) value(?,?,?)";
		
		PreparedStatement preparedStatment = connection.prepareStatement(query);
		
		System.out.println("Enter name:");
		preparedStatment.setString(1, sc.nextLine());
		
		System.out.println("Enter salary:");
		preparedStatment.setDouble(2, sc.nextDouble());
		
		System.out.println("Enter department:");
		preparedStatment.setString(3, sc.next());
		
		int rows = preparedStatment.executeUpdate();
		
		if(rows!=0)
		{
			System.out.println("Record inserted successfully");
		}
	}
	
	private void selectRecord() throws SQLException
	{
		System.out.println("Enter id number to find the result:");
		int number = Integer.parseInt(sc.nextLine());
		String query = "select * from employee where id = " + number;
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(query);
		
		if(resultSet.next())
		{
			int idNumber = resultSet.getInt("id");
			String name = resultSet.getString("name");
			double salary = resultSet.getDouble(3);
			String department = resultSet.getString(4);
			
			System.out.println("IdNumber:" + idNumber);
			System.out.println("Name:" + name);
			System.out.println("Salary:" + salary);
			System.out.println("Department:" + department);
		}
		else
		{
			System.out.println("No records Found");
		}
	}
	
	private void selectAllRecord() throws SQLException
	{
		String query = "select * from employee";
		Statement statement = connection.createStatement();
//		CallableStatement callStatement = connection.prepareCall("{call GET, ALL()}");
		ResultSet resultSet = statement.executeQuery(query);
		
		while(resultSet.next())
		{
			int idNumber = resultSet.getInt("Id");
			String name = resultSet.getString("name");
			double salary = resultSet.getDouble(3);
			String department = resultSet.getString(4);
			
			System.out.println("IdNumber:" + idNumber);
			System.out.println("Name:" + name);
			System.out.println("Salary:" + salary);
			System.out.println("Department:" + department);
		}
	}
	
	private void updateRecord() throws SQLException
	{
		System.out.println("Enter the id to update employee details");
		int idNumber = Integer.parseInt(sc.next());

			System.out.println("Enter the choice you need");
			System.out.println("Enter 1 if you want to update Employee name");
			System.out.println("Enter 2 if you want to update Employee salary");
			System.out.println("Enter 3 if you want to update Employee Depatment name");
			System.out.println();

			String updateQuery = "update employee set";
			int option = Integer.parseInt(sc.next());
			switch (option)
		{
		case 1: {
			System.out.println("Enter new Employee Name");
			String newName = sc.next();
			updateQuery = updateQuery + " name = ? where id =" + idNumber;

			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, newName);
			int row = preparedStatement.executeUpdate();
			if (row != 0)
				System.out.println("Record updated successfully");
			break;
		}
		case 2: {
			System.out.println("Enter new Employee salary");
			Double newSalary = sc.nextDouble();
			updateQuery = updateQuery + " sal = ? where id =" + idNumber;

			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setDouble(1, newSalary);
			int row = preparedStatement.executeUpdate();
			if (row != 0)
				System.out.println("Record updated successfully");
			break;
		}
		case 3: {
			System.out.println("Enter new Employee Department");
			String newDept = sc.next();
			updateQuery = updateQuery + " dept = ? where id =" + idNumber;

			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, newDept);
			int row = preparedStatement.executeUpdate();
			if (row != 0)
				System.out.println("Record updated successfully");
			break;
		}
		default :
			throw new IllegalArgumentException("Unexpected value: " + option);
			}
	}
	
	private void deleteRecord() throws SQLException
	{
		System.out.println("Enter Id Number");
		int idNumber = Integer.parseInt(sc.nextLine());
		
		String sql = "delete from employee where id =" + idNumber;
		
		Statement statement = connection.createStatement();
		
		int row = statement.executeUpdate(sql);
		
		if(row!=0)
		{
			System.out.println("Record Deleted Successfully.");
		}
	}
}
