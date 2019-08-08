package com.pojo;

public class Student {

	private String FirstName;
	private String LastName;
	private String DateOfBirth;
	private String username;
	private String password;
	private String city;
	private String addressLine1;
	private int studentID;
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String dateOfBirth, String username, String password, String city,
			String addressLine1, int studentID) {
		super();
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		this.username = username;
		this.password = password;
		this.city = city;
		this.addressLine1 = addressLine1;
		this.studentID = studentID;
	}
	
	public Student(String studentParam[], String Definition[]) {
		super();
		int i =0;
		for(String field : Definition)
		{
			switch(field)
			{
				case "FirstName":
					FirstName = studentParam[i];
				break;
				case "LastName":
					LastName = studentParam[i];
				break;	
				case "AddressLine1":
					this.addressLine1 = studentParam[i];
				break;
				case "City":
					this.city = studentParam[i];
				break;
				case  "DateOfBirth":
					DateOfBirth = studentParam[i];
				break;
				case "Username":
					this.username = studentParam[i];
				break;
				case "Password": 
					this.password = studentParam[i];
				break;
				};
			i++;
		}
	}
	
	public String[][] getStringArray(){
		
		String[][] fields = new String[2][8];
		String[] studentParameters = {"StudentID", "FirstName", "LastName", "AddressLine1", "City", "DateOfBirth", "Username", "Password"}; 
		for(int i = 0; i < 8 ;i ++)
		{
			fields[i][0] = studentParameters[i];
		}
		for(int i = 0; i < 8 ;i ++)
		{
			switch(fields[i][0])
				{
					case "StudentID":
					fields[i][1] = studentID + "";
					case "FirstName":
						fields[i][1] = FirstName;
					break;
					case "LastName":
						fields[i][1] = LastName;
					break;	
					case "AddressLine1":
						fields[i][1] = this.addressLine1;
					break;
					case "City":
						fields[i][1] = this.city;
					break;
					case  "DateOfBirth":
						fields[i][1] = DateOfBirth;
					break;
					case "Username":
						fields[i][1] = this.username;
					break;
					case "Password": 
						fields[i][1] = this.password;
					break;
					};
		}
		return fields;
	}
	
	

}
