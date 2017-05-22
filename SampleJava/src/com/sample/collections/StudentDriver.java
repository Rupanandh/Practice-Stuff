package com.sample.collections;

import java.util.Collections;


public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentResource  studentResource = new StudentResource();
		
		for(Student student :studentResource.getStudentList())
		{
			System.out.println(student);
		}
		//studentResource.getStudentList().sort(new Student());
		Collections.sort(studentResource.getStudentList(), new Student());
		System.out.println("");
		for(Student student :studentResource.getStudentList())
		{
			System.out.println(student);
		}
	}

}
