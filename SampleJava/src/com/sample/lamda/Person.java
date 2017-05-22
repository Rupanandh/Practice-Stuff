package com.sample.lamda;

import java.util.ArrayList;

public class Person { 
	
	private String fristName;
	private String lastName;
	private int age;
	
	

	public Person(String fristName, String lastName, int age) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fristName=" + fristName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}
	
	

}
