package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayManipulation {
	
	
	
	//Given this array of strings input: ['cat', 'tac', 'act', 'pot', 'top', 'meow']
	//return the following output: [['cat', 'tac', 'act'], ['pot', 'top'], ['meow']] 
	
	
	public static void main(String args[]) {
		
		String [] inputs ={"cat", "tac", "act", "pot", "top", "meow"};
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		
		for(int i=0;i<inputs.length;i++)
		{
			String value =inputs[i];
			char[] array =value.toCharArray();
			Arrays.sort(array);
			String key= new String(array).intern();
			if(map.containsKey(key))
			{
				ArrayList<String>al=map.get(key);
				al.add(value);
				map.put(key, al);
			}
			else{
				ArrayList<String> al=new ArrayList<String>();
				al.add(value);
				map.put(key, al);
			}
			
		}
		
		for(Map.Entry<String, ArrayList<String>> entry :map.entrySet()){
			
			System.out.println(entry.getKey());
			
		}
		
		
	}
	
	
	static int calculateHashCode(String value)
	{
		char[] array =value.toCharArray();
		int sum=0;
		for(Character c:array)
		{
		sum+=Character.getNumericValue(c);
		}
		System.out.println("");
		
		return sum; 
	}

}
