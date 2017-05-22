package com.sample.collections;

public class Teacher implements Comparable<Teacher> {
	
	
	private int teacherId;
	private String firstName;
	private String lastName;
	private double salary;
	
	

	public Teacher(int teacherId, String firstName, String lastName,
			double salary) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}



	public int getTeacherId() {
		return teacherId;
	}



	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public int compareTo(Teacher teacher) {
		// TODO Auto-generated method stub
		return this.lastName.compareTo(teacher.getLastName());
	}



	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}
