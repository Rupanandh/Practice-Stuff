package com.array;

public class ArrayManipulation {

	String[] stringPool = new String[7];

	void add(String data) {
		int count = 0;
		for (String value : stringPool) {
			if (value != null) {
				count++;

			}
		}
		if(count<stringPool.length)
		{
		stringPool[count] = data;}
		else{
			System.out.println("Index is out of bounds");
		}

	}

	void remove(int index) {
		int arraySize = 0;
		
		for (String value : stringPool) {
			System.out.println(value);
			if (value != null) {
				arraySize++;

			}
			else{
				System.out.println("pool is empty");
			}
		}
		
		
		for(int count=0; count<arraySize;count++)
		{
			if(count==index)
			{ System.out.println("Count matched");
				
			for (int i=index;i<arraySize;i++)
				{
					stringPool[i]=stringPool[i+1];
				}
			}
		}
		for (String value : stringPool) {
			System.out.println(value);
		}
		

	}

}
