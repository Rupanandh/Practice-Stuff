package com.sample.lamda;

import java.util.ArrayList;
import java.util.Collections;

public class PersonExecutor {
	static ArrayList<Person> personList = new PersonResource().getPersonList();

	public static void main(String[] args) {

		Collections.sort(personList, (person1, person2) -> person1
				.getLastName().compareTo(person2.getLastName()));
		printConditionally(personList, person -> true);
		printConditionally(personList, person -> person.getFristName()
				.startsWith("C"));

	}

	public static void printConditionally(ArrayList<Person> personsList,
			Condition condition)

	{

		for (Person person : personsList) {
			if (condition.checkCondition(person)) {
				System.out.println(person);
			}
		}

	}

}

interface Condition {

	boolean checkCondition(Person person);
}
