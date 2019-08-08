package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.StudentWeb;
import com.pojo.Student;


@WebServlet("/StudentWebDB")
public class StudentWebDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private Connection dbConn;
	private String[] studentParameters = {"FirstName", "LastName", "AddressLine1", "City", "DateOfBirth", "Username", "Password" };
	private String[] searchParameters = {"FirstName", "LastName", "DateOfBirth"};
	
	public void init(ServletConfig config) throws ServletException {
		String username = "StudentAdmin";
		String password = "Weltec2019";
		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			dbConn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:StudentWeb",username, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("AddStudent") != null)
		{
			String temp[] = new String[7];
			int i = 0;
			for(String param : studentParameters)
			{
				temp[i] = request.getParameter(param);
				i++;
			}
			Student tempStudent = new Student(temp, studentParameters);			
			if (StudentWeb.insertStudentRecord(dbConn, tempStudent))
				response.sendRedirect("index.jsp");
			else
				response.sendRedirect("Error.jsp");
		}
		else if(request.getParameter("Search") != null)
		{
			String temp[] = new String[3];
			for (int i = 0;i<3 ;i ++)
			{
				temp[i] = request.getParameter(searchParameters[i]);
			}
			
			int studentID = StudentWeb.getStudentID(dbConn, temp);
			if (studentID != -1)
			{
				Student resultStudent = StudentWeb.reportStudentRecord(dbConn, studentID);
				System.out.println(resultStudent.getFirstName());
				
				System.out.println((String.valueOf(resultStudent.getStudentID())));
				request.setAttribute("StudentID", String.valueOf(resultStudent.getStudentID()));
				request.setAttribute("FirstName", resultStudent.getFirstName());
			    request.setAttribute("LastName", resultStudent.getLastName());
			    request.setAttribute("AddressLine1",resultStudent.getAddressLine1());
			    request.setAttribute("City", resultStudent.getCity());
			    request.setAttribute("DateOfBirth", resultStudent.getDateOfBirth());
			    request.setAttribute("userName", resultStudent.getUsername());
			    request.getRequestDispatcher("EditStudent.jsp").forward(request, response);
			}
			else {
				response.sendRedirect("Search2.jsp");
			}
				
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
