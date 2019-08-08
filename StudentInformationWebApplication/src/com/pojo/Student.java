package com.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;

	private int studentID;
	private String firstName;
	private String lastName;
	private String addressLine1;
	private String city;
	private String dateOfBirth;
	private String userName;
	private String userPassword;
	
	public Student(int studentID, String firstName, String lastName, String addressLine1, String city,
			String dateOfBirth, String userName, String userPassword) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getAddressLine1() {
		return addressLine1;
	}



	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
	
	
	

	
	
	
}
