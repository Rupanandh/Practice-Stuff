package com.sample.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	private static Scanner scanner;
	
	public static void main(String[] args)
	{
		try {
			readInputsFromFile("C:/Workspace/SampleJava/src/com/sample/collections/input.txt");
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
	}

	public static void readInputsFromFile(String fileLocation) throws FileNotFoundException {
		
		List<Integer> integerList = new ArrayList<Integer>();
		scanner = new Scanner(new File(fileLocation));
		//The first line contains an integer,  (the initial number of elements in ). 
		int initialElementsCount = Integer.parseInt(scanner.nextLine().trim());
		//The second line contains  space-separated integers describing . 
		
		for(int count =0; count < initialElementsCount ; count++)
		{
			integerList.add(Integer.parseInt(scanner.next()));
		}
		scanner.nextLine();
		//The third line contains an integer,  (the number of queries). 
		int queryCount = Integer.parseInt(scanner.nextLine().trim());
		 for(int count =0; count < queryCount; count++)
		 {
			 String action =scanner.nextLine();
			
			 switch(action){
			 case "Insert":
				 int position = Integer.parseInt(scanner.next());
				 int value =Integer.parseInt(scanner.nextLine().trim());
				 integerList.add(position, value);
				 break;
			 case "Delete":
				 int index = Integer.parseInt(scanner.nextLine());
				 integerList.remove(index);
			 }
		 }
		 
		 for (Integer integer : integerList) {
			 System.out.print(integer+" ");
			
		}
		

	}

}
