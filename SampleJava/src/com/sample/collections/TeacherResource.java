package com.sample.collections;

import java.util.ArrayList;

public class TeacherResource {
	
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
	
	
	
	public ArrayList<Teacher> getTeacherList() {
		return teacherList;
	}



	public TeacherResource()
	{
		teacherList.add(new Teacher(12312, "Rahul", "Rhit", 234234234));
		teacherList.add(new Teacher(342313123, "Sai", "chnad", 234234));
		teacherList.add(new Teacher(12312123, "MIdhuledh", "Raju",2332434 ));
		teacherList.add(new Teacher(113234, "Sricharan", "Rupa", 3434534));
		teacherList.add(new Teacher(1313, "Arjun", "Kiran", 34532134));
		teacherList.add(new Teacher(324231, "Siddarth", "Moil", 345636));
	
	}

}
