package com.sample.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
	private static Scanner scanner;

	public static void main(String[] args) {

		try {
			readInputsFromFile("C:/Workspace/SampleJava/src/com/sample/collections/input.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void readInputsFromFile(String fileLocation)
			throws FileNotFoundException {

		HashMap<String, String> personMap = new HashMap<String, String>();
		scanner = new Scanner(new File(fileLocation));
		int entriesCount = Integer.parseInt(scanner.nextLine());
		for(int count =0; count <entriesCount; count++)
		{
			String name = scanner.nextLine();
			String phoneNumber = scanner.nextLine();
			personMap.put(name, phoneNumber);
		}
		
		while(scanner.hasNextLine())
		{
			String name = scanner.nextLine();
			if(personMap.containsKey(name))
			{
				System.out.println(name+"="+personMap.get(name));
			}
			else{
				System.out.println("Not found");
			}
		}
		
	}
}
