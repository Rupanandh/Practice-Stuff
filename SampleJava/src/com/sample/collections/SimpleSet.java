package com.sample.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class SimpleSet {
	
	
	
	public static void  generateUniqueSets(String filepath) throws FileNotFoundException
	{	
		HashSet<String> strings=new HashSet<String>();
		Scanner scanner = new Scanner(new File(filepath));
		//In the first line, there will be an integer  denoting number of pairs.
		int pairsCount = Integer.parseInt(scanner.nextLine());
		for(int count =0; count<pairsCount; count++)
		{
			strings.add(scanner.nextLine());
			System.out.println(strings.size());
		}
	}

}
