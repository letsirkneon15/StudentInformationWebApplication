package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentManagement
 */
@WebServlet("/StudentManagement")
public class StudentManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentManagement() {
    	
    }
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		
		//doGet(request, response);
	}

}
