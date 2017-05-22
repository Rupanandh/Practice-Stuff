package com.sample;

import java.util.Scanner;

public class ArrayJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayLength=0;
        int jumpLength=0;
        int testArray[];
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        for(int count =0 ;count <testCaseCount ; count++)
            {
             arrayLength = scanner.nextInt();
             jumpLength = Integer.parseInt(scanner.nextLine().trim());
             testArray= new int[arrayLength];
            for(int arrayCount =0 ; arrayCount<arrayLength; arrayCount++)
                {
                int value = Integer.parseInt(scanner.next().trim());
                testArray[arrayCount] = value;
           
            }
            
            int walkIndex=0;
            boolean walkCheck=true;
            int walkCheckIndex=0;
            
           while(walkCheck && walkCheckIndex < (testArray.length-1))
                {
               
                if( testArray[walkCheckIndex+1]!=testArray[walkCheckIndex])
                    {
                   walkCheck =false;
                    break;
                 }
                walkCheckIndex++;
                walkIndex++;
               System.out.println("walkCheckIndex::"+walkCheckIndex +"walkIndex::"+walkIndex);
            }
            
            if((walkIndex+jumpLength)>=arrayLength)
                { System.out.println(" MAIN if");
                System.out.println("YES");
            }
            else if(!(testArray[walkIndex+jumpLength]>arrayLength))
                {
                if(testArray[walkIndex+jumpLength] == 0)
                    {
                     System.out.println(" sub if");
                    System.out.println("YES");
                }
                else if(testArray[(walkIndex-1)+jumpLength] == 0)
                    {
                    System.out.println(" sub else if");
                     System.out.println("YES");
                }
            }
            else
                {
                System.out.println(" else ");
                System.out.println("NO");
            }
        }
    }
}
