package com.pojo;

import java.io.Serializable;

public class Course implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int courseID;
	private String courseName;
	private String courseDesc;
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	
	
}
