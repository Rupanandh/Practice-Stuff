package com.sample.collections;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentResource implements Comparator<Student> {
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public StudentResource()
	{
		studentList.add(new Student(4242, "Rupanandh", "Moori"));
		studentList.add(new Student(55642, "Venkata", "Reddy"));
		studentList.add(new Student(6722, "Lalitha", "Moori"));
		studentList.add(new Student(143413, "Ranga", "Yerrabolu"));
		studentList.add(new Student(56345, "Vardhan", "Uday"));
	}

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return student1.getFristName().compareTo(student2.getFristName());
	}

}
