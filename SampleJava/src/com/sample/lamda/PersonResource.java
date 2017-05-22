package com.sample.lamda;

import java.util.ArrayList;

public class PersonResource {
	
	private ArrayList<Person> personList = new ArrayList<Person>();
	public ArrayList<Person> getPersonList() {
		return personList;
	}
	public PersonResource()
	{
		personList.add(new Person("Rupanandha", "Nandha", 28));
		personList.add(new Person("Venkata", "Reddy", 50));
		personList.add(new Person("Lalitha", "Muri", 45));
		personList.add(new Person("Ranga", "Yerrabolu", 34));
		personList.add(new Person("Cukku", "Akki", 22));
		
		
	}
	
	

}
