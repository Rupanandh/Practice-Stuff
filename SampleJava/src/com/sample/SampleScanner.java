package com.sample;

import java.util.Scanner;

public class SampleScanner {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input array size::");
		int arraySize = scanner.nextInt();
		int intValues[] = new int[arraySize];
		int negativeArrayCount = 0;
		
		int arraySum = 0;
		
		
		/*System.out.println("Input array values:");
		  	int count=0;
		 	while (scanner.hasNext()) {
			int integerValues = scanner.nextInt();
			intValues[count] = integerValues;
			count++;
		}
		*/
		
		System.out.println("Input array values:");	
		Scanner scanner1 = new Scanner(System.in);
		String valueString = scanner1.nextLine();		
		String valuesArray[] = valueString.split(" ");		
		for(int index =0 ; index < valuesArray.length;index++)
		{
			intValues[index] = Integer.parseInt(valuesArray[index]);
		}
		
		scanner.close();
		scanner1.close();
		for (int index = 0; index < intValues.length; index++) {
			
			if (intValues[index] < 0) {
				negativeArrayCount++;
			}
			
			for (int subIndex =0; subIndex<index;subIndex++)
			{
				 arraySum = arraySum+intValues[index];
				 negativeArrayCount++;
			}
				
		}
		System.out.print("negativeArrayCount:::"+negativeArrayCount);
		
		
	}

}
