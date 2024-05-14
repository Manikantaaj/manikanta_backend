package com.excel.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.excel.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoimpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertStudent(Student student)
	{
		String query = "insert into Student(id, name, marks) values(?,?,?)";
		return jdbcTemplate.update(query, student.getId(),student.getName(), student.getMarks());
	}
	
	@Override
	public int updateStudent(Student student)
	{
		String query = "update Student set name=?, marks=? where id=?"; 
		return jdbcTemplate.update(query, student.getName(), student.getMarks(), student.getId());
		
	}
	
	@Override
	public int deleteStudent(int id)
	{
		String query = "delete from Student where id=?";
		return jdbcTemplate.update(query, id);
		
	}
	
	@Override
	public List<Student> getAllStudent()
	{
		String query = "select * from Student";
		return jdbcTemplate.query(query, new RowMapper<Student>(){

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				  Student student = new Student();
	                student.setId(rs.getInt(1));
	                student.setName(rs.getString(2));
	                student.setMarks(rs.getInt(3));
	                return student;
				
			}
		});
	}
}
