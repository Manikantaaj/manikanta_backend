package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner sc = new Scanner(System.in);
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			
			Connection connection = DriverManager.getConnection(url, user, pass);
			
			String query = " insert into student(name, percentage, adress) values(?,?,?)";
			
//			Statement statement = connection.createStatement();
//			int executeUpdate = statement.executeUpdate(query);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			System.out.println("enter name");
			preparedStatement.setString(1, sc.next());
			
			System.out.println("enter percentage");
			preparedStatement.setDouble(2, sc.nextDouble());
			
			System.out.println("enter adress");
			preparedStatement.setString(3, sc.next());
			
			boolean execute = preparedStatement.execute();
			System.out.println(execute);
			
//			System.out.println(executeUpdate);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
