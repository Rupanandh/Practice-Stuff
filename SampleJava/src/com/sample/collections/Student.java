/**
 * 
 */
package com.sample.collections;

import java.util.Comparator;

/**
 * @author S525063
 *
 */
public class Student implements Comparator<Student>{
	
	private int studentID;
	private String fristName;
	private String lastName;
	
	
	public Student(int studentID, String fristName, String lastName) {
		super();
		this.studentID = studentID;
		this.fristName = fristName;
		this.lastName = lastName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int compare(Student student1, Student student2) {	
		
		return student1.getFristName().compareTo(student2.getFristName());
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fristName=" + fristName
				+ ", lastName=" + lastName + "]";
	}
	
	
	

}
