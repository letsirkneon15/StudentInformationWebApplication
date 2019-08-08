package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pojo.Student;


public class StudentWeb {
	public static boolean insertStudentRecord(Connection d, Student s) {
		
		try {     
			PreparedStatement p = d.prepareStatement("insert into student(firstName, LastName, City, AddressLine1, userName, userPassword, dateOfBirth) Values (?,?,?,?,?,?,CAST(? as Date))");
				p.setString(1, s.getFirstName());
				p.setString(2, s.getLastName());
				p.setString(3, s.getCity());
				p.setString(4, s.getAddressLine1());
				p.setString(5, s.getUsername() );
				p.setString(6, s.getPassword());
				p.setString(7, s.getDateOfBirth());
				return p.executeUpdate() == 1 ? true :false;
			
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("Error on insert");
			}
		return false;
	}
	
	public static boolean updateStudentRecord(Connection d, Student s)
	{
		
		return false;
	}
	
	public static Student reportStudentRecord(Connection d, int id)
	{
		Student tempStudent = new Student();
		String getStudentQuery = "select firstName, LastName, AddressLine1, City, userPassword, Username, Studentid, CAST(DateOfBirth as varchar(100)) as DateOfBirth from student where studentID = ?";
		PreparedStatement p;
		try {
			p = d.prepareStatement(getStudentQuery);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			while(rs.next())
			{
				tempStudent.setFirstName(rs.getString("FirstName"));
				tempStudent.setLastName(rs.getString("LastName"));
				tempStudent.setAddressLine1(rs.getString("AddressLine1"));
				tempStudent.setCity(rs.getString("City"));
				tempStudent.setPassword(rs.getString("userPassword"));
				tempStudent.setUsername(rs.getString("Username"));
				tempStudent.setStudentID(rs.getInt("studentID"));
				tempStudent.setDateOfBirth(rs.getString("DateOfBirth"));
			}	
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return tempStudent;
	}
	
	public static int getStudentID(Connection d, String[] searchFields)
	{
		int StudentID = -1;
		String idCountQuery = "SELECT studentID as returnCount\r\n" + 
				"FROM student\r\n" + 
				"where student.firstname = ? and student.lastName = ? and student.dateofbirth = Cast(? as date)\r\n" + 
				"UNION ALL\r\n" + 
				"SELECT -1 as returnCount\r\n" + 
				"FROM dual\r\n" + 
				"WHERE NOT EXISTS (SELECT studentID\r\n" + 
				"FROM student\r\n" + 
				"where student.firstname = ? and student.lastName = ? and student.dateofbirth = Cast(? as date))";
		PreparedStatement p;
		try {
			p = d.prepareStatement(idCountQuery);
			for(int i = 1; i <= 6; i++)
			{	
				p.setString(i, searchFields[(i-1) % 3]);
			}
			ResultSet rs = p.executeQuery();
			while(rs.next())
			{
				StudentID = rs.getInt(1);
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return StudentID;
	}
		
	public static boolean deleteStudentRecord(Connection d, int id)
	{
		String deleteQuery = 'Delete from student where studentID = ?'
		preparedStatement p;
		
		try {
			p = d.prepareStatement(deleteQuery);
		}
		
		
		return false;
	}
}

