package com.sample.collections;

import java.util.Collections;

public class TeacherDriver {

	public static void main(String[] args)
	{

		TeacherResource teacherResource = new TeacherResource();
		for (Teacher teacher : teacherResource.getTeacherList()) {

			System.out.println(teacher);

		}
		Collections.sort(teacherResource.getTeacherList());

		System.out.println(" ");

		for (Teacher teacher : teacherResource.getTeacherList()) {

			System.out.println(teacher);

		}
	}
}
